package PATTERN;

import java.util.Scanner;
//                      *
//                    *
//                  *
//               *
//            *





public class _12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i = 0; i <n ; i++) {

            if (i == 0) {
                System.out.print("*");

            }
            else
            {
                for (int j = 1; j <=i ; j++) {

                    System.out.print(" ");


                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
