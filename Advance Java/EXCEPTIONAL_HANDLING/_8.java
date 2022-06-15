package EXCEPTIONAL_HANDLING;

public class _8 {
    public static void main(String[] args) {
        int a = 100, b = 0, c;

        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            c = a / b;
//       IF WE WRITE REST OF THE COUNTING IN TRY AFTER
//           C=A/B... THE COUNTING WONT BE PRINTED
//            THAT'S WHY WE NEED FINALLY
//

        } catch (Exception e) {

            System.out.println(e);
        } finally {
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
        }

    }
}
