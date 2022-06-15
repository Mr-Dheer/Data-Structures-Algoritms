package EXCEPTIONAL_HANDLING;

import java.util.Scanner;

public class throw_keyword_1 {
    public static void main(String[] args) {


//        MENE KHUD KA EXCEPTION BANAYA HAI
//        YOUNGER AGE EXCEPTION KE NAME SE
//        USSEE MEIN ISS CODE MEIN USE KARONGA
//        PEHLE REGISTER MEIN DEKH LOO
//        PHIR YAHA AAKE DHEKNA
//        REGISTER MEIN CLARITY MEIN LIKHA HAI

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age Dr.Dheer");
        int age = s.nextInt();

        if (age < 18) {
            throw new YoungAgeException("Your age is less buddy");
        } else {

            System.out.println("Vote successfull Dr.Dheer");
        }
    }
}
