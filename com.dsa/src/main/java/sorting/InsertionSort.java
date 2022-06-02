package sorting;

import java.util.Arrays;
// select the minimum value and iterate over array to compare
//with every iteration smallest value will be put to the start of the array
//Worst case time	O(n^2)
//Best case time	O(n^2)
//Average case time	O(n^2)
//Space	O(1)


//good algo for small dataset
//good algorithm when array is partly sorted as number of steps are reduced as loop break when sorted section of array is encountered
// best case complexity is O(N) -- when array is already sorted, worst case is O(n^2) --- array sorted in desc
public class InsertionSort {

//divide array to sorted and unsorted part and increase the number of elements in sorted section by insertion
    public static void main(String[] args) {
        int[] arr = {4,5,2,-1,0,3,7,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
// i indicates total number of passes - which will be equal to N-2

    static void sort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
////this loop runs in backward direction to ensure only unsorted elements are compared
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;

// we assume that array is sorted for any value of j where element at j>j-1 so no reason to traverse the whole array
            }
        }

    }
}
