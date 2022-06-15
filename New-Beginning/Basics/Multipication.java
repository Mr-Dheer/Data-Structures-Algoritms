package Basics;

import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number==");
        int n=s.nextInt();

        System.out.print           ("enter another number==");
        int k=s.nextInt();

        int c=k*n;
        System.out.println("the answer is ="+c);
    }
}
