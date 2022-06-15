package ARRAY;

import java.util.ArrayList;

public class Odd_Even {
    public static void main(String[] args) {

        int [] arr={2,3,4,5,6,7,8};

        ArrayList<Integer> temp=new ArrayList();
        ArrayList<Integer> temp2=new ArrayList();

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] % 2 == 0) {
                temp.add(arr[i]);
            }
            else{
                temp2.add(arr[i]);
            }

        }
        System.out.println("Even number are= "+temp);
        System.out.println("Odd number are= "+temp2);


    }
}
