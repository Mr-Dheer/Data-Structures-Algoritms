package ARRAY;

import java.util.Scanner;

public class kth_max {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Enter the value of the k");
        int k = s.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

        }
        int temp = max + 1 - k;
        System.out.println(temp);


    }

}
