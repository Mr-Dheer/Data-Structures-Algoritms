package RECURSION;

import Basics.Area_Trapezium;

public class _20_RECUR   {
    public static void main(String[] args) {

        System.out.println(Mindset("abba",0,3));

    }

    public static boolean Mindset(String str,int start,int end){


        if (start==end)
            return true;

        else
            return str.charAt(start)==str.charAt(end) &&
                    Mindset(str,start+1,end-1);
    }
}
