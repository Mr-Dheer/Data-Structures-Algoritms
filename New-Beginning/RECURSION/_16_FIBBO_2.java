package RECURSION;

public class _16_FIBBO_2 {
//    THIS IS GIVING US THE DIRECT VALUE OF JISKE HUMNE MAANGE HAI
    public static void main(String[] args) {

        System.out.println(Caring(4));

    }

    public static int Caring(int n){

        if (n==0)
            return 0;
        else if (n==1)
            return 1;

        else

            return Caring(n-1)+Caring(n-2);
    }


}
