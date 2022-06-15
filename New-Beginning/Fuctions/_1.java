package Fuctions;

public class _1 {
    public static void main(String[] args) {
        func1();
        func2();
    }

    public static void func1(){
        System.out.println("hello");

    }

    public static void func2(){
        System.out.println("hello again");

        func1();
    }
}
