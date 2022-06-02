package sorting;

import java.util.Arrays;

//split array into chunks of array of size one by recursively dividing array from middle
//every recursive call will divide array into half
//merge these unsorted single unit arrays to form larger sorted array
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2,4,12,3,67,34,56,17};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //since we are following recursion, after splitting merge and sort operation both will work on left side of array first

    static int[] mergeSort(int[]arr){
        if(arr.length ==1)
            return arr;

        int mid = arr.length/2;
//this is process of division of arrays into half until single celled arrays are formed
//A copy of original array is created at every call with smaller chunks
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length+ right.length];
        //make a new empty array of size to accommodate both left and right halves
        int i=0,j =0,k=0;
        while(i< left.length && j<right.length){

            if(left[i]>right[j]){
                mergedArray[k] = right[j];
                j++;
            }
            else{
                mergedArray[k] = left[i];
                i++;
            }
            k++;

        }
        while(i< left.length){
            mergedArray[k] = left[i];
            i++;
            k++;

        }

        while(j< right.length){
            mergedArray[k] = right[j];
            j++;
            k++;

        }

        return mergedArray;


    }

}
