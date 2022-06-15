package RECURSION;

public class _6_factorial {
    public static void main(String[] args) {

//        SEE NOTES FOR EXPLANATION


        System.out.println(fact(5));

    }

    static int fact(int n) {

        if (n==0)
            return 1;

        else
            return n* fact(n-1);
    }
}
