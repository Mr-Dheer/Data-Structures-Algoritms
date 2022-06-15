package STACK_QUESTIONS_PEP;

import java.util.Scanner;

public class _3_Next_Greater_Element_On_Right {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 1, 6};

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Index");
        int n = scn.nextInt();

        int count = 0;

        for (int i = n + 1; i < arr.length; i++) {

            if (arr[n] < arr[i]) {
                System.out.println(arr[i]);
                count++;
                return;
            }

        }


        if (count == 0) System.out.println("-1");
    }
}
