package HASH_MAP_QUESTIONS;

import java.util.HashMap;

public class _2_Common_Element_Better {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 5};
        int[] array = {1, 1, 1, 2, 2, 4, 5};

        HashMap<Integer, Integer> key = new HashMap<>();

        for (int var : arr) {

            if (key.containsKey(var)) {

                int temp = key.get(var);
                temp++;
                key.put(var, temp);

            } else
                key.put(var, 1);
        }

        for (int var : array) {

            if (key.containsKey(var)) {

                System.out.println(var);
                key.remove(var);
            }
        }


    }
}
