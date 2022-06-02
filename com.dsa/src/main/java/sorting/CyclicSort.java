package sorting;

import java.util.ArrayList;
import java.util.Arrays;
// n distinct numbers in range 0 to N or 1 to N always use cyclic sort
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,2,7,5,6,1,4};
        sort(arr);
       // System.out.println(Arrays.toString(arr));
       // pom();
    }
    static void sort(int[] arr){
        int i=0;
        while(arr.length>i){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else i++;

        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

//    public static void pom(){
//        ArrayList<String> a = null;
//        for(String s : a){
//            if(s==null){
//            System.out.println("okay)");
//            }
//        }
//    }


}
