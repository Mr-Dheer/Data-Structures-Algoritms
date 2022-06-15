package ARRAY;

public class Common_elemnt_from_2_array {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50, 99, 888};
        int[] arr2 = {2, 1, 3, 1, 5, 2, 2, 99, 888};

        System.out.println("The common elements are :- ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    System.out.print(" " + arr1[i]);
                }

            }

        }
    }
}
