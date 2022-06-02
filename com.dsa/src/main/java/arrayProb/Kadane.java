package arrayProb;
//find max sum of sub array of any size with +ve and -ve Elements
public class Kadane {

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, -2, 6, -8, 5,7};
        System.out.println(maxSumSubArray(arr));
        System.out.println();

        String s = "This is a test string";
        String[] a = s.split("//s");
        System.out.println("ans " + a.length);


    }

    static int maxSumSubArray(int[] arr) {
        int maxSumTotal = arr[0];
        int maxSumEndingHere = arr[0];

        for(int i =1; i<arr.length; i++) {
            maxSumEndingHere = Math.max(maxSumEndingHere + arr[i], arr[i]);

            if (maxSumEndingHere  > maxSumTotal){
                maxSumTotal = maxSumEndingHere;
            }

        }
        return maxSumTotal;

    }
}