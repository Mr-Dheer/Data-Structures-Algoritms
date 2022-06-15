package RECURSION;

public class _14_FIBONACCI {
    public static void main(String[] args) {

//        NORMAL FIBONACCI I KNEW TUJHE YEH VALLA YAAD NAHI HOGA
//        I KNOW YOU VERY WELL MR.DHEER :)

        int a = 0, b = 1;

        System.out.println(0+" ");
        for (int i = 0; i <= 10; i++) {

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
