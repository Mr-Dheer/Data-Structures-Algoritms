package Basics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");
        int k=s.nextInt();
        int fact=1;

        for (int i = 1; i <=k ; i++) {


            fact=fact*i;

        }
        System.out.println("Factorial of a number is="+fact);



    }
}
