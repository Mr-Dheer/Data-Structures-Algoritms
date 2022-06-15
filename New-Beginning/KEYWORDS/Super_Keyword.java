package KEYWORDS;

public class Super_Keyword {
    int number = 100;

}

class kavach extends Super_Keyword {

    int number = 200;

//     void show(int number) {
//         System.out.println(number);
//         System.out.println(this.number);
//         System.out.println(super.number);
//     }

}

class bapuJi extends kavach {

    int number = 69;

    void show() {

        System.out.println(super.number);
    }


    public static void main(String[] args) {

        bapuJi obj = new bapuJi();
        obj.show();
    }


}