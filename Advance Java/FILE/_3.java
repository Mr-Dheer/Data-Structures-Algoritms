package FILE;

import java.io.File;

public class _3 {
    public static void main(String[] args) {


        File obj=new File("K:/Shailonka.txt");

        boolean b=obj.delete();

        if (b == true) {

            System.out.println("Success");
        }
        else{

            System.out.println("Fail");
        }
    }
}
