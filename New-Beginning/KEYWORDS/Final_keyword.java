package KEYWORDS;

public class Final_keyword {

    final void hello() {
        System.out.println("Heyya buddy");

    }

}

class KAKA {
    // extends Final_keyword{     we cannot extend final keyword kyuki humne usse
    // final bana diya hai isleye voh override nahi ho sakta


    void hello() {
        System.out.println("I am bindaas");
    }


    public static void main(String[] args) {

        final byte i = 127;
        System.out.println(i);

        KAKA obj = new KAKA();
        obj.hello();


    }
}

