package ARRAY;

import java.util.Arrays;


//THIS CODE WILL WORK ONLY IF THERE IS ONE DUPLICATE NOT MORE
//THAN ONE DUPLICATE


public class Delete_duplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 5};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    arr[i] = arr[j];

                    for (int k = j; k < arr.length - 1; k++) {

                        arr[k] = arr[k + 1];
                    }
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(" " + arr[i] + ",");

        }
    }
}
