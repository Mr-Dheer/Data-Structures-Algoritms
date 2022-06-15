package ARRAY;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5, 6,};


        System.out.println("The number which are repeated are:-");
        for (int i = 0; i < arr.length; i++) {


            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.print(arr[i] + ",");
                }

            }
        }
    }
}
