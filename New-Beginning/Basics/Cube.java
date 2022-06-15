package Basics;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int temp = 1;


        temp = temp * n * n * n;


        System.out.println(temp);
    }
    }

