package ARRAY;

import java.util.ArrayList;
import java.util.HashSet;

public class Merge_array {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {

            arraylist.add(arr1[i]);

        }

        for (int i = 0; i <arr2.length ; i++) {

            arraylist.add(arr2[i]);

        }
        System.out.println(arraylist);



    }
}
