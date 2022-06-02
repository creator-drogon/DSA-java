package arrayProb;

import java.util.*;

public class TripletSum {
// return all the sub arrays in the input that fulfil the condition on the target sum
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
		List<Integer[]> ans = new ArrayList<Integer[]>();
		Stack<Integer> stack = new Stack<>();

		Arrays.sort(array);
		for(int i=0;i<array.length ;i++){
			int currentSum = 0;
			int j = i+1;
			int k = array.length-1;

			while(k>j){
				currentSum = array[i] + array[j] + array[k];

				if(currentSum == targetSum){
					ans.add(new Integer[]{array[i],array[j],array[k]});
					j++;
					k--;
				}
				else if(currentSum>targetSum){
					k--;
				}
				else j++;

			}

		}

    return ans ;
  }

	public static void main(String[] args) {

		final List<Integer[]> integers = threeNumberSum(new int[]{2, 3, 4, 5, 2, 64, 14, 11, 2, 5, 8}, 25);

		integers.forEach(System.out::println);

	}
}

