package ARRAY_ASSIGNEMT;

import java.util.Scanner;

public class _1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int num=s.nextInt();

        int [] arr=new int[num];
        System.out.println("Enter the elements in the array");

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=s.nextInt();

        }


        System.out.println(maximum(arr));


}
    public  static int maximum(int [] arr) {


        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
