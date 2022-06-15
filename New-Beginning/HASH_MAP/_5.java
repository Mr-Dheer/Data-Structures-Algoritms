package HASH_MAP;

import java.util.HashMap;
import java.util.Set;

public class _5 {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 190);
        hm.put("Ireland", 10);
        hm.put("UK", 69);

        Set<String> key = hm.keySet();


        for (String str : hm.keySet()) {

            Integer k = hm.get(str);
            System.out.println(str + " ->" + k);
        }

    }
}
