package OPPS;

public class Polyorphism_3_meathod_overinding {
    void batman() {
        System.out.println("1");

    }
}

class marvel extends Polyorphism_3_meathod_overinding {
    void batman() {
        System.out.println("2");


    }

    public static void main(String[] args) {
        marvel temp = new marvel();
        temp.batman();


    }
}

