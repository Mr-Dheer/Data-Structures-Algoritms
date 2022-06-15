package HASH_MAP;

import java.util.HashMap;
import java.util.Set;

public class _4 {
    public static void main(String[] args) {

        HashMap<String, Integer> hs = new HashMap<>();

        hs.put("India", 120);
        hs.put("Ireland", 120);
        hs.put("Pakistan", 120);

        Set<String> key = hs.keySet();

//       THIS WILL GIVE ALL THE KEYS
        System.out.println(key);

    }
}
