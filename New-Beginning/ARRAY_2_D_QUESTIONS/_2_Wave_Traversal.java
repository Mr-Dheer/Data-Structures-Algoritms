package ARRAY_2_D_QUESTIONS;

public class _2_Wave_Traversal {
    public static void main(String[] args) {

        int[][] arr = {
                        {1, 2, 3, 4, 99},
                        {4, 5, 6, 77, 66},
                        {7, 8, 9, 55, 44}
        };


        for (int i = 0; i < arr[0].length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < arr.length; j++) {

                    System.out.println(arr[j][i]);
                }
            } else {

                for (int j = arr.length-1; j >= 0; j--) {

                    System.out.println(arr[j][i]);

                }


            }

        }

    }
}
