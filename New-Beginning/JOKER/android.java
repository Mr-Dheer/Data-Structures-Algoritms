package JOKER;

import java.util.Arrays;
import java.util.Random;

public class android {
    public static void main(String[] args) {

        int [] arr={11,22,33,44,55,66,77,88,99,100};
        int [] tempArr=new int[arr.length];


        Random random=new Random();


        for (int i = 0; i <arr.length ; i++) {
            tempArr[i]=arr[new Random().nextInt(arr.length)];

        }

        System.out.println(Arrays.toString(tempArr));
         String[] mColorArray = {"red", "pink", "purple", "deep_purple",
                "indigo", "blue", "light_blue", "cyan", "teal", "green",
                "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
                "brown", "grey", "blue_grey", "black" };

        System.out.println(mColorArray.length);

    }
}
