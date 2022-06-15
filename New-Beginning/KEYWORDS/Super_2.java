package KEYWORDS;

public class Super_2 {

    void hello() {
        System.out.println("Oh Pajji kaise ho tussi");

    }
}
    class KAVACH extends Super_2{

    void hello(){
        System.out.println("Mein  changa Pajiii");
    }

    void show(){

        hello();
        super.hello();


        }

        public static void main(String[] args) {

            KAVACH obj=new KAVACH();

            obj.show();

        }
    }

