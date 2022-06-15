package RECURSION;

public class _7_bunny {
    public static void main(String[] args) {
        System.out.println(bunny(5));

    }

    public static int bunny(int n){

        if (n==1)
            return 2;
        else

            return 2+ bunny(n-1);
    }
}
