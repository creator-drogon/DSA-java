package arrayProb;
// find the max profit that can be earned if stocks are bought and sold

public class StockBuySell {
    public static void main(String[] args) {

        int[] arr = {1, 3, 8, -2, 6, -8, 5};
        int ans = findMaxProfit(arr);
        System.out.println(ans);
    }


    static int findMaxProfit(int[] arr){
        // idea here is to try to sell the stock each day against a min value
        // store the current min and update it if we encounter a new min
        int maxProfit = 0;
        int currentMin = arr[0];
        for (int j : arr) {
            currentMin = Math.min(currentMin, j);
            int Profit = j - currentMin;
            maxProfit = Math.max(maxProfit, Profit);

        }
        return maxProfit;


    }


}
