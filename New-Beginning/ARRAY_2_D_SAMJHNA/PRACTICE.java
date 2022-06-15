package ARRAY_2_D_SAMJHNA;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICE {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        int n=s.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter the elements Sir");
        for (int i = 0; i <arr.length ; i++) {

            arr[i]=s.nextInt();

        }

        System.out.println(Arrays.toString(arr));

    }



    }
