package RECURSION;

public class _12 {
    public static void main(String[] args) {

        Success(5);

    }

    public static void Success(int n){

        if (n==0)
            return;

        else{

            Success(n-1);
            System.out.println(n);
        }
    }
}
