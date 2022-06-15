package EXCEPTIONAL_HANDLING;

public class _4 {
    public static void main(String[] args) {
        int a=100,b=0,c;

        try {
            c=a/b;
        }
        catch (ArithmeticException e){
//

//            TRY ALL THE BELOW ONE BY ONE AND SEE
//            THE DIFFERENCES



            e.printStackTrace();

            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
