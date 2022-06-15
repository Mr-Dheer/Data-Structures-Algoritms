package RECURSION_PATHS_2;

import java.util.ArrayList;

public class PRACTICE {
    public static void main(String[] args) {

//        System.out.println(Keypad("123"));

        System.out.println(Stairs(3));


    }

//    static String[] codes = {".,", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static ArrayList<String> Stairs(int n) {

        if (n == 0) {
            ArrayList<String> Dr = new ArrayList<>();
            Dr.add("");
            return Dr;
        }
        if (n < 0) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;

        }

        ArrayList<String> Path1 = Stairs(n - 1);
        ArrayList<String> Path2 = Stairs(n - 2);
        ArrayList<String> Path3 = Stairs(n - 3);

        ArrayList<String> Kavach = new ArrayList<>();

        for (String m : Path1) {

            Kavach.add(1 + m);
        }
        for (String l : Path2) {

            Kavach.add(2 + l);
        }
        for (String p : Path3) {

            Kavach.add(2 + p);
        }

        return Kavach;

    }
}
