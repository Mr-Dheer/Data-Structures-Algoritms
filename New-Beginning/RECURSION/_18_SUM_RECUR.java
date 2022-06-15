package RECURSION;

public class _18_SUM_RECUR {
    public static void main(String[] args) {

        System.out.println(Honest(6));


    }

    private static int sum = 0;

    public static int Honest(int n) {

        if (n == 0)
            return 0;
        else {
            Honest(n - 1);
            sum = sum + n;
            return sum;

        }
    }
}
