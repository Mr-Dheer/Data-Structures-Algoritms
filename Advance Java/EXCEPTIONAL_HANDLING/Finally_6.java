package EXCEPTIONAL_HANDLING;

public class Finally_6 {
    public static void main(String[] args) {
        int a=100,b=2,c;

        try{
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){

            System.out.println(e);

        }
        finally {
            System.out.println("Hello i am here");
        }
    }
}
