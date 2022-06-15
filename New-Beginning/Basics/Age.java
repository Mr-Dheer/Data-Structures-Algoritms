package Basics;

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("what is your age-");

        int temp;
        int n=s.nextInt();

        temp=n*365;


        System.out.println(temp);



    }
}
