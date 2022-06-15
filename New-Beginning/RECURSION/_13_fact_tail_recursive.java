package RECURSION;

public class _13_fact_tail_recursive {
    public static void main(String[] args) {

        System.out.println(Discipline(5, 1));


    }

    public static int Discipline(int n, int k) {

        if (n == 0 || n == 1)
            return k;

        else
            return  Discipline(n - 1, k * n);
    }
}
