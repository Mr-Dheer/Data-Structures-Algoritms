package ARRAY_2_D_SAMJHNA;

public class _4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
