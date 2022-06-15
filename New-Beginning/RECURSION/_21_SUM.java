package RECURSION;

public class _21_SUM {
    public static void main(String[] args) {

        System.out.println(Kind(1));

    }

    public static int Kind(int n) {

        if (n < 10)
            return n;

        else
            return Kind(n / 10) + n % 10;


    }
}
