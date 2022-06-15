package JOKER;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Planning {


    Planning() {

        System.out.println("I am First");

        byte a=27,b=100;
        byte c=a=b;
        System.out.println(c);


    }
}

class B extends Planning {


    B() {

        System.out.println("I am Second");
    }
}

class C extends B {


    C() {

        System.out.println("Nahi Nhi I am First");
    }


    public static void main(String[] args) {

        C obj = new C();

    }


}