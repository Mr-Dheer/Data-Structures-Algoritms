package ARRAY;

public class _2_min {
    public static void main(String[] args) {

        int[] arr = {10, 5, 90, 80};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
