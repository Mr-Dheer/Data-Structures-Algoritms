package STRINGS;

public class PRACTICE {
    public static void main(String[] args) {

        
        String str = "Kaavach";
        String ss = "";
        int count = 1;


        ss += str.charAt(0);


        for (int i = 1; i < str.length(); i++) {

            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i - 1);

            if (ch1 == ch2) {
                count++;
            } else {

                if (count > 1) {
                    ss += count;
                    count = 1;

                }

                ss += ch1;
            }


        }

        if (count > 1) {
            ss += count;
        }

        System.out.println(ss);


    }
}
