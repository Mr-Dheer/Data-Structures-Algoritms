package RECURSION;

import java.util.ArrayList;

public class PRACTICE {
    public static void main(String[] args) {

        System.out.println(Humble("abc",0));

    }

    public static ArrayList<String> Humble(String str,int temp) {

        if (str.length() == 0) {

            ArrayList<String> Dr = new ArrayList<>();
            Dr.add("");
           temp++;
            return Dr;
        }

        char ch = str.charAt(0);
        String rosie = str.substring(1);

        ArrayList<String> Kavach = Humble(rosie,temp);


        ArrayList<String> Dheer = new ArrayList<>();

        for (String k : Kavach) {

            Dheer.add("" + k);
            temp++;
            Dheer.add(ch + k);
        }

        return Dheer;
    }
}
