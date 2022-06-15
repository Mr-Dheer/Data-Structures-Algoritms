package THREAD;


// 7-8 baar run karoo and then output dheko kabhi
// Hello Paji aayega fist output kabhi I
// I am Running ayyega first output
//kyuki threading ke andher dono saath mein
// run ho rhe hai program ..
// see notes for detail



public class Normal_class_2 extends Thread {

    public void run() {

        System.out.println("Hello Paji");
    }
}

class Test extends Thread {

    public void run() {

        System.out.println("I am Running");
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.start();

        Normal_class_2 dummy = new Normal_class_2();
        dummy.start();


    }
}
