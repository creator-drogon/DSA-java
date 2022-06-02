package leetcode;

/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.*/

import java.util.LinkedHashMap;

public class FirstAndLast {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;


    }
    public int search(int[] nums, int target, boolean searchFirst){

        int start =0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){

            int mid = start + (end - start)/2;
            if(nums[mid] >target) end = mid -1;
            else if(nums[mid] < target) start = mid+1;
            else if(nums[mid] == target){

                ans = mid; //potential ans;

                if(searchFirst == true)end = mid-1; //search for ans in the left of array
                else if(searchFirst == false) start = mid +1; // search ans in right of array
            }
        }

        return ans;
    }
}
