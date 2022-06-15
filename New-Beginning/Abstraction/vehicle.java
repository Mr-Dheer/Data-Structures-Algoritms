package Abstraction;

abstract public class vehicle {

    abstract void start();


    public static void main(String[] args) {

        car obj = new car();
        obj.start();

        scooter obj2 = new scooter();

        obj2.start();



    }
}