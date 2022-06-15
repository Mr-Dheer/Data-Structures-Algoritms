package Basics;
import java.util.Scanner;
public class tables_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int k=s.nextInt();

        for (int i = 1; i <11 ; i++) {

            System.out.print(k+"X"+i+"="+k*i+" ");  // simple logic is k*i
        }

    }
}
