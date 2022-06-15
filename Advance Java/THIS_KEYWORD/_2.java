package THIS_KEYWORD;

public class _2 {

    public void hello(){

        System.out.println("Yooiiii !!!");

    }

    public void show(){

        hello(); // compiler automatically puts this.hello();
    }

    public static void main(String[] args) {

        _2 obj=new _2();
        obj.show();
    }
}
