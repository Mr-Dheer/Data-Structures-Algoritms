package Basics;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double temp,pie=3.14;

        System.out.println("Enter the radius");
        int k=s.nextInt();

        temp=pie*k*k;

        System.out.println("The area of circle is="+temp);


    }
}
