package INNER_CLASSES;

public class _1 {

    public void show() {

        System.out.println("Pajii tuse kaise ho");

    }

    public class m2 {

        public void display() {

            System.out.println("Badiya paajij !!");
        }
    }

    public static void main(String[] args) {
        _1 obj = new _1();
        obj.show();

        _1.m2 obj2 = obj.new m2();

        obj2.display();
    }
}
