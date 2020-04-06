package MainHomeWork;
//        4. Написать методы, реализующие рассмотренные виды сортировок
//           Сравнение времени выполнения пузырьковой сортировки,
//           сортировки выбором и быстрой сортировки

public class Soarters {

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    static int [] fillArr(int size)     // Задание 2
    {
        int[] arr = new int[size];
        for (int i = 0, j = 0; i < size; i++, j += 3)
            arr[i] = (int)(Math.random()*100);
 //       printArr(arr);
        return arr;
    }
    public static void bubbleSort(int [] arr){
 //       printArr(arr);
//        long start = System.nanoTime();
        int out, in;
        for (out = arr.length - 1 ; out >= 1 ; out--) {
            for (in = 0 ; in < out; in++) {
                if ( arr[in] > arr[in + 1 ]) {
                    int tmp = arr[in];
                    arr[in] = arr[in+1];
                    arr[in+1] = tmp;
                }
            }
        }
//        long finish = System.nanoTime();
//        long result=finish-start;
        printArr(arr);
//        System.out.println("Время выполнения программы:"+result+"\n");
    }

    static void selectionSort(int[] arr) {
  //      printArr(arr);
//        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
//        long finish = System.nanoTime();
//        long result=finish-start;
        printArr(arr);
//        System.out.println("Время выполнения программы:"+result+"\n");
    }

    public static int[] quickSort(int[] source, int leftBorder, int rightBorder) {
                int leftMarker = leftBorder;
                int rightMarker = rightBorder;
                int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

           if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
           }
        if (leftBorder < rightMarker) {
              quickSort(source, leftBorder, rightMarker);
        }
        return source;
    }
    public static void main (String[]args){
         /* так как нельзя замерить время выполнения внутри рукурсивного метода  быстрой
            сортировки приходится замерять время до и после каждого метода */
        int[] arr= fillArr(20);
        int[] arr1= fillArr(20);
        int[] arr2= fillArr(20);
        int[] arr3=new int[20];

        long start = System.nanoTime();
              bubbleSort(arr);
        long finish = System.nanoTime();
        long result=finish-start;
        System.out.println("Время выполнения программы Buble sort :"+result+"\n");

        start = System.nanoTime();
           selectionSort(arr1);
        finish = System.nanoTime();
        result=finish-start;
        System.out.println("Время выполнения программы Selection sort :"+result+"\n");

        start = System.nanoTime();
          printArr(quickSort(arr2,0,19));
        finish = System.nanoTime();
        result=finish-start;
        System.out.println("Время выполнения программы Quick sort:"+result+"\n");

    }
}

