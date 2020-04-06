import java.util.Scanner;

public class Spiral {
    public static void printArr( int [][] mass)
    {
        for (int i=0; i < mass.length; i++)
        {
            for (int j=0; j <mass[i].length;j++)
            {
                System.out.print(mass[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

    public static void toSpiral(int row,int col ) {
        int xo = 0;
        int yo = 0;
        int x = col - 1;
        int y = row - 1;
        int count = 0;
        int size = col * row;
        int[][] spiral = new int[row][col];

        while (count < size) {
//                   System.out.println("Начало  цикла WHILE:");

         for (int i = xo; (i < x)&&(count < size); i++, count++) {
            //                    System.out.println(" Первый цикл FOR:");

            spiral[yo][i] = count;
         }

         for (int i = yo; (i < y) &&(count < size) ; i++, count++) {
//                      System.out.println(" Второй цикл FOR:");
                 spiral[i][x] = count;

         }

         for (int i = x; (i > xo) &&(count < size) ; i--, count++) {
//                       System.out.println(" Третий цикл FOR:");
            spiral[y][i] = count;

         }
         for (int i = y; ( i > yo) && (count < size ); i--, count++) {
//                      System.out.println(" Четвёртый цикл FOR:");
            spiral[i][xo] = count;
         }
            xo++;
            yo++;
            x--;
            y--;
            if(xo==x && row==col )   // иначе непопадаем в первый цикл с проверкой:  i = xo; (i < x)
                {x++;}
//              {xo--;}  делал и так но тогда надо в певом цикле size-1 чтобы не затирал последним
//                       значением предыдущее

    }

         printArr(spiral);
         System.out.print("\n");
    }

    public static void main(String[] args) {

        toSpiral(5,5);
        toSpiral(5,6);
        toSpiral(5,4);

            Scanner in = new Scanner(System.in);
            System.out.printf("Введите количество строк: \n");
            int rows = in.nextInt();
            System.out.println("Ведите колоичество столбцов: ");
            int columns = in.nextInt();
            in.close();
            System.out.println("\n");

        toSpiral(rows,columns);

    }
}
