package EXCEPTIONAL_HANDLING;

import jdk.nashorn.internal.runtime.ECMAException;

public class Fianlly_7 {
    public static void main(String[] args) {

        int a = 100, b = 0, c;

        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception e) {

            System.out.println(e);
        } finally {
            System.out.println("Hello i am here");
        }
    }
}
