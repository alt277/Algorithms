package MainHomeWork;
//        1. Создаем массив большого размера (миллион элементов) и печатаем .

class MakeBigArray {

   static final int million=10000000;

    public static int [] makeBigArr(){
        int[] bigarray= new int[million];
        for (int i = 0; i < bigarray.length; i++) {
            bigarray[i] =i+1;
        }
        return bigarray;
    }
    public static void printArr(int[] mass) {
        System.out.println("\n");
        int n=10;
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "\t");
            if(i==n-1){n+=10;
                System.out.println("\n");
            }
        }
    }

    public static void main(String[] args) {
        printArr(makeBigArr());
    }

}

