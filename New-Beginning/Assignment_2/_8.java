package Assignment_2;
import java.util.Scanner;
//        1
//        22
//        303
//        4004
//        50005


public class _8 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i = 1; i <=n ; i++) {

            if (i == 1) {
                System.out.print(i);
            }
            else
            {
                System.out.print(i);
                for (int j = 1; j <=i-2 ; j++) {

                    System.out.print("0");

                }
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
}
