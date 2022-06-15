package ARRAY;

public class _1_max {
    public static void main(String[] args) {
        int[] arr = {40, 50, 30};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
