package INPUT_OUTPUT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("K:/Tata.txt")) {
            int i;


            while ((i = fis.read()) != -1) {

                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileOutputStream fos = new FileOutputStream("K:/Discipline.txt")) {

            String s = "With dicipline and determination you will get there ";
            byte[] b = s.getBytes();
            fos.write(b);

        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
