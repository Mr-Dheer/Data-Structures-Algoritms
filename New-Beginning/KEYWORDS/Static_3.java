package KEYWORDS;

public class Static_3 {

    void display(){

        System.out.println("Kitta veere");
    }

    static void show(){
        System.out.println("Badiya veer ji");

    }

    public static void main(String[] args) {
//        Static_3 obj=new Static_3();  it saves us  from making object to call that method

//        obj.display();
        Static_3.show();    // static meathod will be called with the class name
        show();             // or even call directly also call it

    }
}
