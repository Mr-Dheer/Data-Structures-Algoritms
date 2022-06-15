package OPPS;

public class Constructor {
    String name;
    int age;

    public Constructor(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println(age+" "+name);
    }


    public static void main(String[] args) {

        Constructor k = new Constructor("kavach", 10);
        Constructor k1 = new Constructor("appu", 88);


//      NOTE
//        CONSTRUCTOR SAVES US FROM WRITING THIS BELOW EXTRA PIECE OF CODE
//        WHICH SAVES US FROM TIME AND HENCE IT IS ALSO NOT GOOD PROGRAMMING.
//
//        Constructor k=new Constructor();

//        k.name="kavach";
//        k.age=89;






    }
}