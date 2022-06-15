package RECURSION;

public class _29_ARR_LAST_INDEX {
    public static void main(String[] args) {
        int [] arr={10,20,99,20,40,99,80};
        System.out.println(Bold(arr,arr.length-1,99));

    }

    public static int Bold(int [] arr,int index,int x){

        if (index==0)
            return -1;

        if (x==arr[index])
            return index;

       return Bold(arr,index-1,x);
    }
}
