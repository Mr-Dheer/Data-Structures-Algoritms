package Basics;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("Enter average for how many numbers");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int temp=0;

        for (int i = 1; i <=k ; i++) {

            System.out.println("enter the number");
            int n=s.nextInt();
            temp=temp+n;

        }
        System.out.println("Average is="+temp/k);
    }
}
