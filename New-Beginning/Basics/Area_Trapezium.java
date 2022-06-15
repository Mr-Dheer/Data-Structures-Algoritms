package Basics;

import java.util.Scanner;

public class Area_Trapezium {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp;

        System.out.println("Enter first base");
        int k=s.nextInt();

        System.out.println("Enter second base");
        int m=s.nextInt();

        System.out.println("Enter height");
        int n=s.nextInt();

        temp=(k+m)/2*n;

        System.out.println("Area of trapezium is="+temp);













    }
}
