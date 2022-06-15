package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_element {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the element to be inserted");
        int k = s.nextInt();

        System.out.println("Enter the index at which element is to be inserted");
        int n = s.nextInt();


        for (int i = arr.length - 1; i > n; i--) {


            arr[i] = arr[i - 1];
        }
        arr[n] = k;

        System.out.println(Arrays.toString(arr));
    }
}
