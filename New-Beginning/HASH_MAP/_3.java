package HASH_MAP;

import java.util.HashMap;

public class _3 {
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India",250);

//        ISMEE YEH BATATA HAI KE KEYS PRESENT HAI KE NAHI
//        RUN AND SEE
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Ireland"));
    }
}
