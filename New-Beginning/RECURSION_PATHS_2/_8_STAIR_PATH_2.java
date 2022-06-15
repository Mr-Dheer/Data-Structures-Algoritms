package RECURSION_PATHS_2;

public class _8_STAIR_PATH_2 {
    public static void main(String[] args) {

        CEO(3, "");

    }

    public static void CEO(int n, String ans) {

        if (n == 0) {
            System.out.print(ans + "  ");
            return;
        }
        if (n < 0) {
            return;
        }

        CEO(n - 1, ans + 1);
        CEO(n - 2, ans + 2);
        CEO(n - 3, ans + 3);


    }
}
