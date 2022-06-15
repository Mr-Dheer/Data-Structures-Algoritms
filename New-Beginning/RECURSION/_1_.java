package RECURSION;

public class _1_ {
    public static void main(String[] args) {


         kavach(1);
    }

    public static void kavach(int n){

        if (n==6)
            return ;

        else
            System.out.println(n);
            kavach(n+1);

    }
}
