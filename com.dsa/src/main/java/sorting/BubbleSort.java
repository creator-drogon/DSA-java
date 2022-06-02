package sorting;

import java.util.Arrays;
//just perform simple comparison of adjacent elements, every iteration aims at pushing the largest element to end of array
//reduce search space to search will n-1-i for every ith iteration
//The Worst Case: O(n^2)
//Average Case: O(n*log n)
//Best case: O(n*log n)
public class BubbleSort {
// creating bubble of sorted elements starting from last index and gradually increasing size of bubble
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 56, 7, 5, 3, 26};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }
}
