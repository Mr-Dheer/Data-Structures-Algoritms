package EXCEPTIONAL_HANDLING;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class throw_2 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number");

        int age=s.nextInt();

        if (age < 18) {
            try {

                throw new YoungAgeException("Vote Fail");
            }
            catch (YoungAgeException e){
                System.out.println(e+" sorry buddy");
            }
        } else{

            System.out.println("Vote success");
        }


    }
}
