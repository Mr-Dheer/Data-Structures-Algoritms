package ARRAY;

public class First_Duplicate {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 4, 5, 6, 5, 6};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    temp = temp + 1;
                    break;
                }
            }
            if (temp > 0) {
                break;

            }
        }
    }
}
