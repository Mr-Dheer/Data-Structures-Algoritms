package ARRAY_2_D_SAMJHNA;

import javax.security.sasl.SaslClient;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_2_D {
    public static void main(String[] args) {

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

        System.out.println("The Array is as follow's");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }
}
