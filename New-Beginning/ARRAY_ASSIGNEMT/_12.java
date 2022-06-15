package ARRAY_ASSIGNEMT;

import java.util.ArrayList;

public class _12 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;

        func(arr,target);
    }

    public static void func(int [] arr,int target){

       ArrayList<Integer> arraylist=new ArrayList<>();

        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                temp = arr[i] + arr[j];

                if (temp == target) {


                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }

        }


    }


    }


