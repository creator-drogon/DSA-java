package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countRotations {
    public static void main(String[] args){
        int[] nums = {6,5,1,2,3,4};
        System.out.println("number of times array is rotated is "+ (findPivot(nums) + 1 ));
    }




    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else start = mid+1;

        }
        return -1;
    }
}
