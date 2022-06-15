package KEYWORDS;

public class This_keyword {

    int num;

    public void hello(int num) {

        this.num = num;
    }

    public void show() {

        System.out.println(num);

    }

    public static void main(String[] args) {
        This_keyword obj = new This_keyword();

        obj.hello(100);
        obj.show();

    }


}

