package ENCAPSULATION;

public class _1 {

    private int age;


    public void setAge(int age) {
        if (age >= 18) {
            System.out.println("Hello old age  uncle !!");
        } else {
            System.out.println("Hello kiddo");

        }
    }

    public void getAge() {

        System.out.println(age);
    }

    public static void main(String[] args) {
        _1 obj = new _1();

        obj.setAge(1);
        obj.getAge();
    }
}


