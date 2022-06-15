package FILE;

import java.io.File;
import java.io.IOException;

public class _9 {
    public static void main(String[] args) {

//        ISMEE MENE IK FOLDER BANAYA PEHLE AND PHIR USS FOLDER
//        KE ANDHER IK NEW FILE BANAYI
//        AND PHIR MENE CHECK KIYAA KE USS FOLDER KE ANDHDRER
//        KITNEE FILES HAI


        File obj = new File("K:/Shailonka");

        if (obj.mkdir()) {
            System.out.println("Success");
        } else {

            System.out.println("Fail");
        }

        try {
            File f = new File("K:/Shailonka/abc.txt");
            File f2 = new File("K:/Shailonka/Tata.txt");


            f.createNewFile();
            f2.createNewFile();
        } catch (IOException e) {

            e.printStackTrace();
        }

      File [] list=obj.listFiles();


        int temp = 0;
        for (int i = 1; i <=list.length ; i++) {


            System.out.println(list[i]);
            temp=i;
        }
        System.out.println("The number of file is = "+temp);

    }
}
