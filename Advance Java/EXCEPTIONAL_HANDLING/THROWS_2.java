package EXCEPTIONAL_HANDLING;

import java.io.FileNotFoundException;

public class THROWS_2 {
    public static void main(String[] args) {

        FileNotFound_Exception obj = new FileNotFound_Exception();


//      HUMNE IDHER EXCEPTION KO HANDLE KER LIYA HAI
//


        try {
        obj.read();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


        try{
            obj.write();
        }catch (Exception e){

            System.out.println(e);
        }

    }
}
