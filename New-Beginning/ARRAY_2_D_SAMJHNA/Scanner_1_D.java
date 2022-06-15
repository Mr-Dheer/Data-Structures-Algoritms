package ARRAY_2_D_SAMJHNA;

import java.util.Scanner;

public class Scanner_1_D {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the Array");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = s.nextInt();

        }

        System.out.println("The Array is as Follow's");

        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ",");

        }
        System.out.print("}");

    }
}
