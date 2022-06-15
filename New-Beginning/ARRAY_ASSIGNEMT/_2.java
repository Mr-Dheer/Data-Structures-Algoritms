package ARRAY_ASSIGNEMT;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();

        int [] arr={10,20,30,40,50,5,1};
        System.out.println(kavii(arr,n));


    }

    public static int kavii(int [] arr,int n){

        for (int i = 0; i <arr.length ; i++) {

            if (n==arr[i]){

                return i;
            }


        }
        return -1;
    }





        }




