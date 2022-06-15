package RECURSION_PATHS_2;

import java.util.ArrayList;

public class _2_KEYPAD {

    public static void main(String[] args) {

        System.out.println(Happy("123"));
    }

    static String[] codes = {".,", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static ArrayList<String> Happy(String str) {

        if (str.length() == 0) {
            ArrayList<String> Dr = new ArrayList<>();
            Dr.add("");
            return Dr;
        }
        char ch = str.charAt(0); //1
        String rosie = str.substring(1); //23

        ArrayList<String> Kavach = Happy(rosie); //--,-2,-3,23

        ArrayList<String> Dheer = new ArrayList<>();

        String temp = codes[ch - '0'];   // converted char in digit
        for (int i = 0; i < temp.length(); i++) {

            char dummy = temp.charAt(i); // in each single alphabet added Kavach
            for (String l : Kavach) {

                Dheer.add(dummy + l);
            }
        }
        return Dheer;


    }
}
