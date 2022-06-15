package Basics;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number");
        int a = s.nextInt();

        if (a % 4 == 0) {
            System.out.println("it is a leap year");
        }

        else
        {
            System.out.println("it is not a leap year");
        }
    }


}
