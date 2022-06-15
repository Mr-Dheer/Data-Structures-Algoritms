package THIS_KEYWORD;

public class _1 {
    int x;
    public void set(int x){

        this.x=x;
    }

    public void show(){

        System.out.println(x);
    }

    public static void main(String[] args) {

        _1 obj=new _1();

        obj.set(100);
        obj.show();
    }
}
