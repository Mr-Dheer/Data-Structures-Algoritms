package PATTERN;

import java.util.Scanner;
//         *
//       *
//     *
//   *
// *
public class _13 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <n-i ; j++) {

                System.out.print(" ");


            }
            System.out.print("*");
            System.out.println(" ");

        }
    }
}
