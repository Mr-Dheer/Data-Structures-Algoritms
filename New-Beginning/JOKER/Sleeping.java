package JOKER;

import java.util.HashMap;
import java.util.Scanner;

public class Sleeping {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter Something");
        String str=s.next();

        HashMap<Character,Integer>hm=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);

            if (hm.containsKey(ch)){

                int temp=hm.get(ch);
                temp++;

                hm.put(ch,temp);
            }
            else
                hm.put(ch,1);

        }

        char temp=str.charAt(0);
        for (Character dummy:hm.keySet()){

            if (hm.get(dummy)>hm.get(temp))
                temp=dummy;

        }

        System.out.println(temp);

    }
}
