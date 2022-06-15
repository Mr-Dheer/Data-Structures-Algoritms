package INPUT_OUTPUT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _5 {
    public static void main(String[] args) {


//        ik file see ke andher jo likha hai uskoo copye kerke
//        ik new file banaker usmee copy karoo
//        this is what i have done below;


        FileOutputStream fos = null;

        try (FileInputStream fis = new FileInputStream("K:/Tata.txt")) {

            fos = new FileOutputStream("K:/Kavach.txt");


            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
