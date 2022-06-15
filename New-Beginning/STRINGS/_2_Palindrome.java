package STRINGS;

import sun.font.TrueTypeFont;

public class _2_Palindrome {
    public static void main(String[] args) {

        String str = "abac";


        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String ss = str.substring(i, j);

                if (palindrome(ss)==true) {

                    System.out.println(ss);
                }

            }

        }

    }

    private static boolean palindrome(String str) {


        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {

            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if (ch1 != ch2)
                return false;
            else {

                i++;
                j--;
            }
        }
        return true;
    }
}
