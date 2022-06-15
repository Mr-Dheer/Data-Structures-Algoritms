package Basics;

import java.util.Scanner;

public class Greater_2_number {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        System.out.println("enter a number");
        int a=s.nextInt();

        System.out.println("enter another number");
        int b=s.nextInt();

        if(a>b)
        {
            System.out.println("the bigger number is "+a);


        }
        else
        {
            System.out.println("the bigger number is "+b);
        }
    }
}
