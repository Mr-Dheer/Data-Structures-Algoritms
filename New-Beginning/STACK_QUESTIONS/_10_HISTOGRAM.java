package STACK_QUESTIONS;

public class _10_HISTOGRAM {
    public static void main(String[] args) {

        _10_HISTOGRAM obj = new _10_HISTOGRAM();

        obj.histogram();

    }

    int[] arr = {6, 2, 5, 4, 1, 5, 6};
    int curr = 0;
    int count = 0;

    public void histogram() {


        System.out.print(arr[0] + ", ");

        for (int i = 1; i < arr.length; i++) {


            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] >= arr[i]) {

                    curr = arr[i] + curr;
                    count++;
                } else {
                    break;
                }
            }

            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i] <= arr[j]) {


                    curr = arr[i] + curr;
                    count++;

                } else {
                    break;
                }

            }
            if (count == 1) {

                curr = arr[i] + arr[i];
            }
            if (count == 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(curr + ", ");
                curr = 0;
                count=0;
            }
        }
    }
}
