package EXCEPTIONAL_HANDLING;

public class Try_Catch_5 {
    public static void main(String[] args) {


    int a = 100, b = 0, c;

//        c=a/b;

        try {
        c = a / b;
    } catch (Exception e) {


        System.out.println(e);


        System.out.println("You cannot divide by zero");

//            You can do either  of the above two

        }

    }
}


