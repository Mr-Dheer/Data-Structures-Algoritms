package ARRAY_ASSIGNEMT;

import java.util.ArrayList;
import java.util.Arrays;

public class _14 {
    public static void main(String[] args) {
        int[] a = {5, 5, 1};
        int[] b = {3, 4, 5};
//        int[] c = new int[a.length];
        ArrayList<Integer> arraylist=new ArrayList<>();
        for (int i = 0; i < a.length; ++i) {
            arraylist.add(a[i] + b[i]);
        }
        System.out.println(arraylist);
    }
}
