package RECURSION;

public class _19_SUM_RECUR_2 {
    public static void main(String[] args) {

        System.out.println(Positive(6));

    }

    public static int Positive(int n){

        if (n==0)
            return 0;
        else
            return n+Positive(n-1);
    }
}
