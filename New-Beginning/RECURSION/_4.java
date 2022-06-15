package RECURSION;

import java.awt.event.KeyAdapter;

public class _4 {

    public static void main(String[] args) {

        Kavach(1);

    }

    public static void Kavach(int n){

        if (n==6)
            return;

        System.out.println(n);
        Kavach(n+1);
        System.out.println(n);
    }
}
