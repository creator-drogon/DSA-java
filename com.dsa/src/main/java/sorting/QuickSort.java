package sorting;

import java.util.Arrays;
//after every pass the pivot will br at correct position , so our aim is to find correct position for pivot
// we search violation of the concept that all elements to the right of pivot is greater and elements on left are small
//if this case is not true we swap else {start++} and {end--}
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2,4,12,3,56,76,32,45};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int findPivot(int[] arr,int start,int end)// start and end is used specify the part of the array used
    {
        int pivot = arr[end];
        int left = start;
        int right = end-1;
        //left and right are used to perform SWAP operations
        while(left<right) {
            // all elements to left of pivot should be smaller than pivot
            while (left <= end && arr[left] < pivot) {
            //if true then move ahead
                left++;
            }
            while (right >= start && arr[right] >= pivot) {

                right--;
            }

            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            } else {
            //this swap is for the pivot, we swap left element with end (end is our current pivot)
                int temp2 = arr[left];
                arr[left] = arr[end];
                arr[end] = temp2;


            }
        }

        return left;
    }

    private static void quickSort(int[]a , int start, int end){
        if(start>=end){
            return;
        }
        int pivot = findPivot(a,start,end);
        quickSort(a,start,pivot-1);
        quickSort(a,pivot+1,end);
    }
}
