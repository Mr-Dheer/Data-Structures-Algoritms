package RECURSION;

public class _8_power_of_2 {
    public static void main(String[] args) {

        System.out.println(mys(5));

    }

    public static int mys(int n) {

        if (n == 0)
            return 1;
        else
            return 2 * mys(n - 1);
    }

}
