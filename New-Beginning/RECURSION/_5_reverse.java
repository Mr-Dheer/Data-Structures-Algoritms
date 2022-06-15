package RECURSION;

public class _5_reverse {
    public static void main(String[] args) {

//     SEE OTHERS FIRST TILL 8 THEN COME HERE
        reverse(1234);


    }

    static void reverse(int n) {

        System.out.println(n % 10);

        if (n != 0) {
            reverse(n / 10);
        }

        System.out.println(n % 10);
    }
}
