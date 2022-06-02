package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        int i = 0;
        while (nums.length > i) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j + 1)) {
                ls.add(j + 1);
            }


        }
        return ls;
    }
}