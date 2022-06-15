package PATTERN;

import java.util.Scanner;
//          *
//         * *
//        *   *
//       *     *
public class _16 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);


        System.out.println("Enter a number");
        int n=s.nextInt();


        for (int i = 1; i <=n ; i++) {


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
