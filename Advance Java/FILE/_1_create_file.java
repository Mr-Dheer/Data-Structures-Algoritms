package FILE;

import java.io.File;
import java.io.IOException;

public class _1_create_file {
    public static void main(String[] args) {


        try {
            File obj = new File("K:/Shailonka.txt");

            boolean b = obj.createNewFile();


            if (b == true) {

                System.out.println("Success");
            }
            else {
                System.out.println("Fail");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
