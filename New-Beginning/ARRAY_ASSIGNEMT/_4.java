package ARRAY_ASSIGNEMT;

import java.util.ArrayList;

public class _4 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        func(arr);


    }

    public static void func(int [] arr){

        ArrayList<Integer> arraylist=new ArrayList<>();

        for (int i = arr.length-1; i >=0 ; i--) {

            arraylist.add(arr[i]);

        }
        System.out.println(arraylist);
    }
}
