package THREAD;

public class Thread_Demo_1 extends Thread {

    public void run() {

        System.out.println("1");

    }

    public void walk() {

        System.out.println("2");
    }


    public static void main(String[] args) {

        Thread_Demo_1 obj = new Thread_Demo_1();
        obj.start();


    }


}


