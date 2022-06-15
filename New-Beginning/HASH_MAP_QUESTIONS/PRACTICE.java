package HASH_MAP_QUESTIONS;

import java.util.HashMap;

public class PRACTICE {

    public static void main(String[] args) {

        int[] arr = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int var : arr) {

            map.put(var, true);
        }

        for (int var : arr) {

            if (map.containsKey(var - 1))
                map.put(var, false);
        }

        int ml = 0;
        int start = 0;

        for (int var : arr) {

            int temp = var;
            int length = 1;

            while (map.containsKey(temp + length))
                length++;


            if (length > ml) {
                ml = length;
                start = temp;
            }

        }

        for (int i = 0; i < ml; i++) {

            System.out.println(start + i);

        }


    }
}
