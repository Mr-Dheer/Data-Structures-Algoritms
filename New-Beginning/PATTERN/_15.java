package PATTERN;

import java.util.Scanner;
//1
//12
//123
//1234
public class _15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print(j+1);

            }
            System.out.println(" ");

        }
    }
}
