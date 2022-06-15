package Basics;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int k=s.nextInt();

        int rem,rev=0;

        while (k != 0) {

            rem=k%10;
            rev=rev*10+rem;
            k=k/10;
        }
        System.out.println(rev);



    }
}
