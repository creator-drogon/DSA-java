package sorting;
// complexity in worst case is O(N)
import java.util.Arrays;
// select the minimum value and iterate over array to compare
//with every iteration the smallest value will be put to the start of the array
//Worst case time	O(n^2)
//Best case time	O(n^2)
//Average case time	O(n^2)
//Space	O(1)
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,7,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int min = 0;
//start is incremented after it is filled with smallest value in array of consideration
        // find min value with every iteration
        for(int start =0;start<arr.length; start++) {
            for (int i = start+1; i <= arr.length - 1; i++) {
                if (arr[i] < arr[min]) min = i;

            }
            int temp = arr[start];
            arr[start] = arr[min];
            arr[min] = temp;
        }
    }
}
