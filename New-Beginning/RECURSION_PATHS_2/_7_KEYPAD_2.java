package RECURSION_PATHS_2;

import java.awt.event.ActionListener;

public class _7_KEYPAD_2 {
    public static void main(String[] args) {

        Active("123","");

    }

    static String[] codes = {".,", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void Active(String str,String ans){

        if (str.length() == 0) {
            System.out.print("["+ans+"]"+"  ");
            return;
        }

        char ch=str.charAt(0);
        String rosie=str.substring(1);

        String temp=codes[ch-'0'];
        for (int i = 0; i <temp.length() ; i++) {

            char dummy=temp.charAt(i);
            Active(rosie,ans+dummy);

        }

    }
}
