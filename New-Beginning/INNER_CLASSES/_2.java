package INNER_CLASSES;

public class _2 {

    public void show(){

        System.out.println("Punjabi mast Punjabi");

    }
    public static class B{

        public void display(){

            System.out.println("Haanji punjabi msst Punjabi");
        }


    }

    public static void main(String[] args) {
        _2 obj=new _2();
        obj.show();

        _2.B obj2=new _2.B();

        obj2.display();


    }
}
