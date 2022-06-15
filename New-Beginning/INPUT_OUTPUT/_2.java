package INPUT_OUTPUT;

import java.io.FileOutputStream;
import java.io.IOException;

public class _2 {
    public static void main(String[] args) {


//        WE CAN DO LIKE THIS ALSO ,THIS IS A
//        BETTER WAY THAN _1;
//        KYKUI YAHA PEE HUMMME FILE KO CLOSE NAHI KERNA
//        VOH APNE APP HO JATHE HAI
//        JAISE NEECHE TRY KE SAATH BRACKET MEIN LEKHENGE
//        TOH HUMME PHIR FILE KO CLOSE NAHI KERNA
//        JAISE _1 MEIN KARRA THAA

        try(FileOutputStream fos=new FileOutputStream("K:/DEMO/Company.txt")) {

            String s = "I will be succesfull";

            byte[] b = s.getBytes();

            fos.write(b);
        }catch (IOException e){

            System.out.println(e);
        }
    }
}
