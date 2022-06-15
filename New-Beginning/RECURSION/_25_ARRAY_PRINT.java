package RECURSION;

public class _25_ARRAY_PRINT {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        focus(arr,0);


    }

    public static void focus(int [] arr,int index){

        if(index==arr.length){
            return;
        }

        System.out.println(arr[index]);

        focus(arr,index+1);


    }
}
