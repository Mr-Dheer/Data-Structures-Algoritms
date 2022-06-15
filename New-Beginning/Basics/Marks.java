package Basics;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter for how many subjects");
        int k=s.nextInt();

        int temp=0;
        for (int i = 0; i <k ; i++) {

            System.out.println("enter marks of subject=");
            int m=s.nextInt();

            temp=temp+m;
        }
        System.out.println("the average is="+temp/k*100+"%");
    }
}
