package PATTERN;
import java.util.Scanner;
//        *****
//        *   *
//        *   *
//        *   *
//        *****



public class _19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i =1; i <=n ; i++) {

            if (i == 1) {
                for (int j = 1; j <= n; j++) {

                    System.out.print("*");

                }

            }     else if (i == n) {
                     for (int k = 1; k <= n; k++) {

                         System.out.print("*");

                     }
                 }
                    else {
                         System.out.print("*");
                         for (int l = 1; l <=n-2 ; l++) {

                             System.out.print(" ");

                         }
                         System.out.print("*");

                    }
            System.out.println(" ");
        }
    }
}
