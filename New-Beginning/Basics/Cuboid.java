package Basics;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp;

        System.out.println("Enter length");
        int l=s.nextInt();

        System.out.println("Enter breadth");
        int b=s.nextInt();

        System.out.println("Enter height");
        int h=s.nextInt();

        temp=l*b*h;

        System.out.println("Volume of cuboid is="+temp);








    }
}
