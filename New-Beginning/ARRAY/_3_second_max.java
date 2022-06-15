package ARRAY;

public class _3_second_max {
    public static void main(String[] args) {

        int[] arr = {40, 20, 30, 10, 50};

        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }

            else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];

            }

        }
        System.out.println(max2);
    }
}
