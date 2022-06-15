package Basics;

import java.util.Scanner;

public class Positive_negetivee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();

        if (n >=0) {
            System.out.println("Positive");

        }
        else{
            System.out.println("Negative");
        }
    }
}
