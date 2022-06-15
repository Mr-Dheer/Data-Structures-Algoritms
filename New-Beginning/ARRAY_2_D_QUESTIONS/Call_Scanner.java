package ARRAY_2_D_QUESTIONS;

import java.util.Scanner;

public class Call_Scanner {

    public static void Scanner(){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Rows of the Array");
        int r = s.nextInt();

        System.out.println("Enter the Columns of the Array");
        int c = s.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the Elements in the Array");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = s.nextInt();
            }

        }
    }
}
