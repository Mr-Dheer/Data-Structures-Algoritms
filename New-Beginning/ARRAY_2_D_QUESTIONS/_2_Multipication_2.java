package ARRAY_2_D_QUESTIONS;

public class _2_Multipication_2 {
    public static void main(String[] args) {
        /**
         SAME SOLUTION JUST ANOTHER WAY WRITING THE CODE WITH
         THE USE  OF FUNCTIONS
         */

//        CHANGE R1,C1 MAKE IT SAME AS R2,C2 THEN IT WILL WORK
        int     r1 = 2, c1 = 2,
                r2 = 2, c2 = 2;

        int[][] one = {{10, 20,40},
                       {30, 40,40},};

        int[][] two = {{10, 20},
                       {30, 40}};

        multipily(2,2,2,2,one,two);
    }

    public static void multipily(int r1, int c1, int r2, int c2,
                                 int[][] one, int[][] two) {


        if (c1 != r2) {
            System.out.println("Not possible");
            return;
        }

        int[][] product = new int[r1][c2];

        for (int i = 0; i < product.length; i++) {

            for (int j = 0; j < product[i].length; j++) {

                for (int k = 0; k < c1; k++) {

                    product[i][j] += one[i][k] * two[k][j];

                }

            }

        }
        print(product);

    }

    public static void print(int[][] product) {

        for (int i = 0; i < product.length; i++) {

            for (int j = 0; j < product[i].length; j++) {

                System.out.print(product[i][j] + " ");

            }
            System.out.println();

        }
    }


}
