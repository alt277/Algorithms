package MainHomeWork;
//        1. Создать массив большого размера (миллион элементов).
//        2. Написать методы удаления, добавления, поиска элемента массива.
//        3. Заполнить массив случайными числами.
//        4. Написать методы, реализующие рассмотренные виды сортировок,
//             и проверить скорость выполнения каждой.
    class Array {
         private int[] arr;
         private int size;


         public Array(int[] arr) {
             this.arr = arr;
         }

         public Array(int size) {
             arr = new int[size];
             this.size = size;
             for (int i = 0; i < arr.length; i++) {
                 arr[i] = i*2;
             }
         }
//        public Array(int size,int index) {
//            arr = new int[size];
//            this.size = size;
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = i*index;
//            }
//        }
         public void printArr() {
             System.out.println("\n");
             for (int i = 0; i < this.arr.length; i++) {
                 System.out.print(this.arr[i] + "\t");
             }
         }
//              3. Заполнить массив случайными числами.
         public void fillAlrray() {
             for (int i = 0; i < arr.length; i++) {
                 this.arr[i] = (int) (Math.random() * 100);
             }
         }
 //                2. Поиск элемента массива.
        public boolean find(int number){
             for (int i=0;i<this.arr.length;i++){
                 if(this.arr[i]==number)
                     return true;
             }
             return false;
        }
    //        2. Написать метод удаления:
        public void delete(int number){
             int i,j;
             for ( i=0; i<this.arr.length;i++){
                 if (this.arr[i]==number)
                     break;
             }
             for ( j=i; j < this.arr.length-1; j++){
                 this.arr[j]=this.arr[j+1];
             }
             this.size--;
  //         this.arr[j]=0;
        }
        //        2. Написать метод добавления:
        public void insert(int number){
             int i,j;
             for (i=0;i<this.arr.length;i++ ){
                 if (this.arr[i] >number){
                     break;
                 }
             }
             for (j=this.arr.length-1; j > i; j--){
                 this.arr[j]=this.arr[j-1];
             }
            this.arr[i] =number;
              this.size++;
        }
    public void insertLesson(int value){
        int i;
        for(i = 0; i < this.size; i++) {
            if (this.arr[i]>value) {
                break;
            }
        }
        for (int j = this.size; j > i; j--){
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = value;
        this.size++;
    }

         public static void main(String[] args) {
             Array array = new Array(10);
                 array.fillAlrray();
                 array.printArr();
                 System.out.println( array.find(11));
             Array array1=new Array(new int[]{1,4,5,2,7,8,3,9,10});
                 array1.printArr();
                 array1.delete(2);
                 array1.printArr();
             Array array2=new Array(10);
                 array2.printArr();
                 array2.insert(11);
                 array2.printArr();
      //       printArr(makeBigArr());

         }

     }
