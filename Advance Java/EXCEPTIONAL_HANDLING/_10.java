package EXCEPTIONAL_HANDLING;

import org.omg.CORBA.TRANSACTION_MODE;

public class _10 {

    public void show() {

        int a = 100, b = 0, c;
//        try {
        c = a / b;

//        } catch (Exception e){

//            System.out.println(e);
//        }

//    }
    }

    public static void main(String[] args) {

        _10 obj = new _10();
//

//        I CAN EITHER DO IT HERE JAISE NEECHE KIYA
//        HAI...OR JAISE UPPER KIYA HAI BOTH WAYS ARE
//        CORRECT


        try {
            obj.show();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


