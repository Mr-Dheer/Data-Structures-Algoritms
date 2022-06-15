package ARRAY;

public class Once_element {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 3, 1, 9999, 6, 7, 6, 7};

        int xor = arr[0];

        for (int i = 1; i < arr.length; i++) {

            xor = xor ^ arr[i];

        }
        System.out.println("The element which is not repeated is = " + xor);
    }
}
