package SEARCHING;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int k=s.nextInt();

        int low=0;
        int high=arr.length-1;

        while (low <= high) {
            int mid=(low+high)/2;


            if (arr[mid] == k) {
                System.out.println("The element is present at= "+mid+" index");
                break;
            } else if (arr[mid] > k) {
                high=mid-1;
            } else if (arr[mid] < k) {
                low=mid+1;
            }
            else{
                System.out.println("Element is not present");
            }
        }
        if (low > high) {
            System.out.println("element not found");
        }
    }
}
