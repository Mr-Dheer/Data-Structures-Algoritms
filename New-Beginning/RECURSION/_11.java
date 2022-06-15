package RECURSION;

public class _11 {
//   PRINT N TO 1.. THIS IS THE QUESTION

    public static void main(String[] args) {
        hardwork(5);

    }

    public static void hardwork(int n) {

        if (n == 0)
            return;

        else {
            System.out.println(n);
            hardwork(n - 1);
        }
    }
}
