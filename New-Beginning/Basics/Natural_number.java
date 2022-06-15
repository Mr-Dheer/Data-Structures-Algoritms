package Basics;

import java.util.Scanner;

public class Natural_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int k=s.nextInt();

        for (int i = 1; i <=k ; i++) {

            System.out.print(" "+i);

        }
    }
}
