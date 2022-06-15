package SUPER_KEYWORD;

public class Client {

    int a = 100;

}

class hello extends Client {

    int a = 200;

    public void show(int a) {

        System.out.println(super.a);
    }


}
