package Basics;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       int number=s.nextInt();
       int temp=number;
        int rev=0,rem=0;

        while (number!=0){

            rem=number%10;

            rev=rev*10+rem;

            number=number/10;

        }

        System.out.println(rev);




        if (temp==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }








        }


























    }



