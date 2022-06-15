package INPUT_OUTPUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _3_READ_DATA {
    public static void main(String[] args) {

//        SEE REGISTER THEN COME HERE

        try(FileInputStream fis=new FileInputStream("K:/Shailonka.txt"))
        {

            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);

            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
