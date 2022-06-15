package EXCEPTIONAL_HANDLING;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.FileAlreadyExistsException;

public class FileNotFound_Exception  {

    public void read() throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("K:/abc.txt");

    }

    public void write() throws  FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("K:/Yes.txt");
    }


}
