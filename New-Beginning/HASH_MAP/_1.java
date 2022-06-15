package HASH_MAP;

import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {

//        ORDER MEIN NAHI AAYENGE CHEEZE ISME
//        UNORDERED AAYENGE CHEEZE
//        NEECHE VAALEE RUN KARIO AND NOTICE KERNA
//        JO ORDER MEIN DAALA THAA USME NAHI HONGE CHEEZE

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 250);
        hm.put("Ireland", 150);
        hm.put("Uk", 50);
        hm.put("Canada", 90);

//       CHECK THE ORDER OVER HERE AFTER RUNNING
        System.out.println(hm);


//       IRELAND KE IDHER ISNE VALUE UPDATE KERDE PEHLE
//        RUN AND OBSERVE
        hm.put("Ireland", 69);

        System.out.println(hm);
    }
}
