package INTERFACE;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public interface hello {

    void show();
    int a=100;
}

interface Mentalist {

    void jane();

    void faith();
}


class test implements Mentalist, hello {

    public void show() {

        System.out.println("Heyaa");

    }

    public void jane() {
        System.out.println("Hi Agaiinn");
    }

    @Override
    public void faith() {
        System.out.println("Heeloo Again Guys !!");
    }


    public static void main(String[] args) {
        test obj = new test();

        obj.show();
        obj.jane();
        obj.faith();
    }
}

