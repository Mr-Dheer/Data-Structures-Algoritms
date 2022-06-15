package JOKER;

import java.util.Scanner;

public class Coming {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be deleted");
        int n = s.nextInt();

        int[] arr = {10, 20, 30, 40, 50, 60};


        for (int i = 0; i < arr.length; i++) {

            if (n == arr[i]) {

                for (int j = i; j < arr.length - 1; j++) {
                    arr[i] = arr[i + 1];

                }
            }

        }

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.println(" " + arr[i] + " ");

        }
    }
}
