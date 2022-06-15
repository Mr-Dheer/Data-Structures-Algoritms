package RECURSION;

public class _9 {
    public static void main(String[] args) {

        System.out.println(geeks(16));


    }

    public static int geeks(int n) {

        if (n == 1)
            return 0;
        else
            return 1 + geeks(n / 2);
    }

}
