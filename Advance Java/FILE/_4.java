package FILE;

import java.io.File;
import java.io.IOException;

public class _4 {
    public static void main(String[] args) {

//   SHAILONKA FILE KE ANDHER JO BHEE CHEEZE LIKHE HAI
//   USKEE LENGTH DHEKATHA HAI
//   AGER FILE KE ANDHER KUCH NAHI LIKHA TOH EMPTY DHEKAYEGA

//        TRY RUNNING ONCE JABH FILE EMPTY HAI
//        AND ONCE JABH FILE KE ANDHER KUCH LIKHA HAI
//        PHIR SAMJH MEIN AAYEGA

        File obj = new File("K:/LOL.txt");

        System.out.println(obj.length());

    }
}
