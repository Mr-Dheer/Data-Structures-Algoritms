package FILE;

import java.io.File;

public class _8 {
    public static void main(String[] args) {

//        it makes a folder

        File obj = new File("K:/Shailonka");

        if(obj.mkdir()==true){

            System.out.println("Success");
        }
        else {
            System.out.println("Fail");
        }


    }
}
