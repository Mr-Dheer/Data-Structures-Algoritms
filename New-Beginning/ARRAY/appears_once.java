package ARRAY;

public class appears_once {
    public static void main(String[] args) {
//       XOR JO ELEMENTS SAME HAI UNHE NAHI LETHA
//        UNKE ELAVA VALE NUMBER VALO KE LETHA HAI

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int xor = arr[0];

        for (int i = 1; i < arr.length; i++) {

            xor = xor ^ arr[i];
        }
        System.out.println("The element which is " +
                "appearing once only= " + xor);
    }
}
