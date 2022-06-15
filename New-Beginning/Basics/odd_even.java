package Basics;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {

        System.out.println("enter a number-");

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        if(n % 2 ==0)
        {
            System.out.println("the number is even");

        }
        else //or i can use n %2==1 that will give us a odd number
        {
            System.out.println("the number is odd");
        }


    }
}
