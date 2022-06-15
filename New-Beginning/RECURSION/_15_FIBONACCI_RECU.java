package RECURSION;

public class _15_FIBONACCI_RECU {
    public static void main(String[] args) {

        System.out.print(0+" ");
        Respect(1,0);

    }


    private static int c;

    public static void Respect(int a,int b){

        if (c==13)
            return ;

        else{
            c=a+b;
            System.out.print(c+" ");

             Respect(b,c);
        }
    }
}
