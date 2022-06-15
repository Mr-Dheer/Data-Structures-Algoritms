package RECURSION;

import javax.swing.*;

public class _30_ARR_ALL_INDEX {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 10, 50, 10};
        System.out.println(Leadership(arr, 0, 10, 0));

    }

    public static int Leadership(int[] arr, int index, int x, int times) {

        if (index == arr.length)
            return times;

        if (x == arr[index]) {
            System.out.print("{" + index + "}");
            times++;
        }


        return Leadership(arr, index + 1, x, times);
    }
}
