package FILE;

import java.io.File;

public class _7 {
    public static void main(String[] args) {

        File obj=new File("K:/Shailonka.txt");

        File f=new File("K:/abc.txt");

        obj.renameTo(f);
    }
}
