package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array of positive integers and a positive number K. Write a code to find the maximum sum subarray of size k.
public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,2,9,18,1};
        System.out.println("bruteForce: " + bruteForce(arr,3));
        System.out.println("slidingWindowOptimised: " + slidingWindowOptimised(arr,3));
    }

    public static int bruteForce(int[] arr,int k){
        int sum =0;
        //run outer loop from 0 to n-k to ensure that the last iteration of i still has k elements whose sum is to be found
        for(int i =0;i< arr.length-k;i++){
            int tempSum =0;
            //we are taking k elements in the inner loop -- as (i+k-i = k)
            for(int j=i;j<i+k;j++){
                tempSum = tempSum + arr[j];
            }
            sum = Math.max(tempSum,sum);
        }

        return sum;
    }

    public static int slidingWindowOptimised(int[] arr, int k){
        int sum=0;
        int maxSum =0;
        int start =0;

        for(int end =0;end< arr.length ;end++){
            sum = sum + arr[end];
            if(end>=k-1){
                maxSum = Math.max(sum,maxSum);
                sum = sum - arr[start];
                start++;
            }

        }
        return sum;
    }



    }
