package JOKER;

public class Discipline {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1};
        int temp = arr.length / 2;

        int count = 0;


        for (int i = 0; i < temp; i++) {

            for (int j = arr.length - 1; j >= temp; j--) {

                if (arr[i] == arr[j]) {
                    break;
                }
                else System.out.println("Not PD");


            }

        }
//        if (count == 0) {
//
//            System.out.println("It is Palindrome");
//        }

    }


}
