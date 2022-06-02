package sorting;

import java.util.Arrays;

public class isSorted {

    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9};
        System.out.println(check(arr,arr.length));
    }


    static boolean check(int[] arr, int n){

        if(arr.length == 0 || arr.length == 1) return true;
        else if (arr[0] > arr[1]) return false;
        else  return check(Arrays.copyOfRange(arr,1,n), n-1);
    }
}
