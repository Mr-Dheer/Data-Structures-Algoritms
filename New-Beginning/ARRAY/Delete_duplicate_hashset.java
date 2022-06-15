package ARRAY;

import java.util.HashSet;

public class Delete_duplicate_hashset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            hs.add(arr[i]);
        }

        for (int no : hs) {
            System.out.print(" " + no + ",");
        }
    }
}

