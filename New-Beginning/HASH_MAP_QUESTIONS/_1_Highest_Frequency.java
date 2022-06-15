package HASH_MAP_QUESTIONS;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class _1_Highest_Frequency {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Magical Word");
        String str = s.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (hm.containsKey(ch)) {

                int temp = hm.get(ch);
                int dummy = temp + 1;
                hm.put(ch, dummy);
            } else
                hm.put(ch, 1);

        }


        char max = str.charAt(0);

        for (Character key : hm.keySet()) {

            if (hm.get(key) > hm.get(max))

                max = key;
        }

        System.out.println(max);

    }


}
