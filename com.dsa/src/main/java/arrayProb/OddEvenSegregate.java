package arrayProb;

public class OddEvenSegregate {
/*  Given an array of integers, you need to segregate odd and even numbers in an array.
    Please note : Order of elements can be changed.*/
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,66,23,78,43};
        split(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
    private static void split(int[] arr) {
        int left =0;
        int right = arr.length-1;
        while(arr[left]%2==0){
            ++left;
        }
        while(arr[right]%2 ==1){
            --right;
        }
        if(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }



    }
}
