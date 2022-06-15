package SEARCHING;

import java.util.Scanner;


public class Linear_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();

        }


        System.out.println("Enter a number");
        int k=s.nextInt();

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]==k){
                System.out.println("Your element is present at= "+i+" index");
            }
            else {
                System.out.println("the element is not present");
            }

        }
    }
}
