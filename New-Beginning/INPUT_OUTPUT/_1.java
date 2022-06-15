package INPUT_OUTPUT;

import java.io.FileOutputStream;
import java.io.IOException;

public class _1 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream("K:/Shailonka.txt");

            String s = new String("My company name ");
//
//            HUMNE NEECHE STRING S KO BYTES MEIN CONVERT KIYA HAI
//            KYUKI YEH SIRF BYTES KE FORM MEIN HE WRITE KERTA HAI


            byte b[] = s.getBytes();

//              IDHER STRING S CONVERT HOGYA BYTE KE FORM MEIN
//              AND PHIT HUMNE USSEE JUST NEECHE WRITE KER DIYA

            fos.write(b);


        } catch (IOException e) {

            System.out.println(e);
        } finally {
            try {
                fos.close();

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
