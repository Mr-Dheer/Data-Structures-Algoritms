package RECURSION;

public class _22_POWER {
    public static void main(String[] args) {

        System.out.println(Humble(3,3));

    }

    public static int Humble(int x,int n){


        if (n==0)
            return 1;

        else
            return x*Humble(x,n-1);
    }
}
