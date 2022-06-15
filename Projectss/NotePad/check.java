package NOTEPAD_PROJECT;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class check extends Component  {
    public void main(String[] args) {


        JFileChooser chooser=new JFileChooser();

        int result=chooser.showOpenDialog(this);

        File f=chooser.getSelectedFile();

        try(FileInputStream fis=new FileInputStream(f)){

            int i;

            while ((i=fis.read())!=-1){

                System.out.println((char)i);
            }

        }
        catch (Exception e){

            e.printStackTrace();
        }
    }
}
