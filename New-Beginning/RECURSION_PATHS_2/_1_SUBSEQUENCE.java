package RECURSION_PATHS_2;

import java.util.ArrayList;

public class _1_SUBSEQUENCE {
    public static void main(String[] args) {

        System.out.println(Values("abc"));

    }

    public static ArrayList<String> Values(String str) {

        if (str.length() == 0) {
            ArrayList<String> Dr = new ArrayList<>();
            Dr.add("");
            return Dr;
        }

        char ch = str.charAt(0); //a
        String ros = str.substring(1); // bc

        ArrayList<String> Kavach = Values(ros); // --,-b,-c,bc

        ArrayList<String> Dheer = new ArrayList<>();

        for (String k : Kavach) {

            Dheer.add("" + k); // added blank in(Kavach) --,-b,-c,bc
            Dheer.add(ch + k); // added a in(Kavach) --,-b,-c,bc
        }

        return Dheer;
    }
}
