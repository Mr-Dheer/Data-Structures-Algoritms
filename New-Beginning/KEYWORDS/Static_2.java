package KEYWORDS;

public class Static_2 {
    // try running this program without static then you will understand
     static byte count = 0;

    public Static_2() {
        count++;
        System.out.println(count);


    }

    public static void main(String[] args) {

        Static_2 obj = new Static_2();
        Static_2 obj1 = new Static_2();
        Static_2 obj2 = new Static_2();
        Static_2 obj3 = new Static_2();


    }

}