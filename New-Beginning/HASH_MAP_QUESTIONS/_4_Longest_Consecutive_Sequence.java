package HASH_MAP_QUESTIONS;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.HashMap;

public class _4_Longest_Consecutive_Sequence {
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
            int sl = 1;

            while (map.containsKey(temp + sl)) {

                sl++;
            }

            if (sl > ml) {
                ml = sl;
                start = temp;
            }
        }

        for (int i = 0; i < ml; i++) {

            System.out.print(start + i + "->");

        }

    }
}
