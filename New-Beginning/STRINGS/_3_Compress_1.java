package STRINGS;

public class _3_Compress_1 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("aaabbcceff");

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                char ch1 = str.charAt(i);
                char ch2 = str.charAt(j);

                if (ch1 == ch2)
                    break;

                System.out.print(ch1);
                break;
            }

        }

        char ch = str.charAt(str.length() - 1);
        System.out.println(ch);


    }
}
