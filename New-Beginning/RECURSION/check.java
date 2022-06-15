package RECURSION;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class check {
    public static void main(String[] args) {

        System.out.println(GoodDeeds("abc"));
//        GoodDeeds("abc");


//        GoodDeeds(2);

    }

    public static ArrayList<String> GoodDeeds(String str) {


        if (str.length() == 0) {
            ArrayList<String> Yoi = new ArrayList<>();
            Yoi.add("");
            return Yoi;
        }

        char ch = str.charAt(0);
        String rosie = str.substring(1);

        ArrayList<String> Kavach = GoodDeeds(rosie);

        ArrayList<String> Dheer = new ArrayList();

        for (String k : Kavach) {
            Dheer.add("" + k);
            Dheer.add(ch + k);
        }

        return Dheer;

    }

}