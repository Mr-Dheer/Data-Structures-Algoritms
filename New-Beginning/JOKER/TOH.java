package JOKER;

public class TOH {
    public static void main(String[] args) {

        toh(2,'A','B','C');


    }

    public static void toh(int n, char a, char b, char c) {

        if (n == 1) {

            System.out.println("Move 2 from+" +a +"to"+ c  );
        } else {

            toh(n - 1, a, b, c);
            System.out.println("Move " + n + "from" + a + "to " + c);
            toh(n - 1, b, a, c);
        }

    }
}
