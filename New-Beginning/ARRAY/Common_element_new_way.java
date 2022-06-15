package ARRAY;

import java.util.HashSet;

public class Common_element_new_way {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {10, 20, 30, 5, 60};


        System.out.println("The common element is are=");

        HashSet<Integer> hs = new HashSet<>();

        for (int no : arr1) {

            hs.add(no);

        }
        for (int no : arr2) {

            boolean temp = hs.add(no);


            if (temp == false) {
                System.out.println(no);
            }

        }
    }


}
