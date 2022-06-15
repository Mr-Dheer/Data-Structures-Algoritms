package RECURSION;

public class _27_ARR_MAX {
    public static void main(String[] args) {
        int[] arr = {10, 20, 70, 40, 50};
        System.out.println(ClearMind(arr,1));

    }

    static int temp = 10;

    public static int ClearMind(int[] arr, int index) {

        if (index == arr.length)
            return temp;

        if (temp < arr[index])
            temp = arr[index];

        return ClearMind(arr, index + 1);


    }
}
