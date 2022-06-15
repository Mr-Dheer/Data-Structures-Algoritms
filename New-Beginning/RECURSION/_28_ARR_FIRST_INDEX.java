package RECURSION;

public class _28_ARR_FIRST_INDEX {
    public static void main(String[] args) {

        int [] arr={10,20,99,40,50,20,99};
        System.out.println(NeatAndClean(arr,0,99));

    }

    public static int NeatAndClean(int [] arr,int index,int x){

        if (index==arr.length)
            return -1;

        if (x==arr[index])
            return index;

       return NeatAndClean(arr,index+1,x);
    }
}
