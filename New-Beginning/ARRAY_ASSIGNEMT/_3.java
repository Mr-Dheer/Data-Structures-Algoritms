package ARRAY_ASSIGNEMT;

import java.util.Scanner;

public class _3 {


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");

        int m = s.nextInt();
        System.out.println(find(arr, m));

    }

    public static int find(int[] arr, int m) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] == m) {
                System.out.println("The element is present at= " + mid + " index");
                break;
            } else if (arr[mid] > m) {
                high = mid - 1;
            } else if (arr[mid] < m) {
                low = mid + 1;
            } else {
                System.out.println("Element is not present");
            }
        }

        return -1;

    }
}



















