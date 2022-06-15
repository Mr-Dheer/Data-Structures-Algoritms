package OPPS;

public class Animal {
    public void drink(){
        System.out.println("I am drinking");
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }


    public static void main(String[] args) {
//        Animal simba=new Animal();
        Animal simba=new Animal();

        simba.bark();
        simba.drink();
        simba.eat();
    }
}
