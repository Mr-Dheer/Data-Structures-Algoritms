package KEYWORDS;

public class Static_keywrord {
    String name;
    int age;
    static String company = "Shailonka";

    public Static_keywrord(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void display() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(company);
    }

    public static void main(String[] args) {

        Static_keywrord obj = new Static_keywrord("Mr.Dheer", 20);

        obj.display();
    }
}
//mene comopany name static bana diya kyuki abh maanle koi naya
//object banonga mein toh usme mein name and age toh alag hoga
//but company name toh same hoga hamesha jitnee bhee mein
//objects bannaoo..unn sabh mein company name toh same rahega
//toh isleye space bachane ke liye mene ..company name static ker
//diyaa taaki mujhe baar baar jabh  bhee mein naya object bannno
//toh again mujhe company name naa daalna pade.