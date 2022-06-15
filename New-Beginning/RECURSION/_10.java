package RECURSION;

public class _10 {
    public static void main(String[] args) {

        bindu(7);

    }

    public static void bindu(int n) {

        if (n == 0)
            return;

        bindu(n / 2);
        System.out.println(n % 2);
    }
}
