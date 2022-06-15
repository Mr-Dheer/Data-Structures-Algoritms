package PATTERN;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");

        int n=s.nextInt();

        for (int i = n-1; i >=0 ; i--) {

            for (int j = n-1; j >=i ; j--) {

                System.out.print(" ");


            }
            System.out.print("*");

            if (i == 0) {

            }
            else {


                for (int k = 1; k < i * 2; k++) {

                    System.out.print(" ");


                }
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int i = 1; i <=n ; i++) {
            System.out.print(" ");


            for (int j = 1; j <=n-i ; j++) {

                System.out.print(" ");
            }

            System.out.print("*");

            if (i == 1) {

            }
            else if(i==2){
                System.out.print(" ");
                System.out.print("*");

            } else {
                for (int k = 3; k < i * 2; k++) {
                    System.out.print(" ");

                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
