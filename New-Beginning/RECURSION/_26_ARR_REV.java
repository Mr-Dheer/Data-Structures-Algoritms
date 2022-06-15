package RECURSION;

public class _26_ARR_REV {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        Truthfullness(arr,0);

    }

    public static void Truthfullness(int[] arr, int index) {


        if (index == arr.length)
            return;
        else {
            Truthfullness(arr, index + 1);
            System.out.println(arr[index]);
        }
    }
}
