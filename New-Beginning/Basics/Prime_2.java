package Basics;

public class Prime_2 {
    public static void main(String[] args) {

        int temp=0;

        for (int i = 1; i <=100 ; i++) {

            for (int j = 2; j <=i-1 ; j++) {

                if (i % j == 0) {
                    temp=temp+1;

                }
            }
            if (temp == 0) {
                System.out.print(" "+i);
            }
            else{
                System.out.print(" ");
                temp=0;
            }

        }
    }
}
