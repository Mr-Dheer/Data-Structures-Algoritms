package ARRAY_2_D_QUESTIONS;

import java.util.Scanner;

public class _1_Multipication {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Rows of the Matrix 1");
        int r1 = s.nextInt();


        System.out.println("Enter the Columns of the Matrix 1");
        int c1 = s.nextInt();

        System.out.println("Enter the Rows of the Matrix 2");
        int r2 = s.nextInt();

        System.out.println("Enter the Columns of the Matrix 2");
        int c2 = s.nextInt();


        int[][] one = new int[r1][c1];
        int[][] two = new int[r2][c2];

        System.out.println("Enter " + r1 * c1 + "  elements for Matrix One");
        for (int i = 0; i < one.length; i++) {

            for (int j = 0; j < one[i].length; j++) {

                one[i][j] = s.nextInt();
            }

        }
        System.out.println("Enter " + r2 * c2 + "  elements for Matrix Two");
        for (int i = 0; i < two.length; i++) {

            for (int j = 0; j < two[i].length; j++) {

                two[i][j] = s.nextInt();
            }

        }


        if (c1 != r2) {
            System.out.println("Not Possible");
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

        for (int i = 0; i < product.length; i++) {

            for (int j = 0; j < product[i].length; j++) {

                System.out.print(product[i][j] + " ");

            }
            System.out.println();

        }


    }
}
