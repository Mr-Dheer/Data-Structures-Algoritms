package RECURSION_PATHS_2;

public class _4_TOH_1 {
    public static void main(String[] args) {

        toh(2, 'A', 'B', 'C');

    }

    public static void toh(int n, char A, char B, char C) {

        if (n == 1) {
            System.out.println("Move " + n + " from " + A + " to " +C );

            return;

        } else {

            toh(n - 1, A, C, B);
            System.out.println("Move " + n + " from " + A + " to " +C );
            toh(n - 1, B, A, C);
        }
    }
}
