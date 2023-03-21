class Solution {
    public int BestTimeToBuyAndSellStock(int[] prices) {
        int i = 0;
        int j = 0;
        int profit = 0;

        while (j<prices.length) {
            int currentProfit = prices[j] - prices[i];
            if (prices[i] < prices[j]) {
                profit = Math.max(currentProfit, profit);
            }
            else {
                i = j;
            }
            j += 1;
        }
        return profit;
    }
}


/*
 *  2nd Attempt In Java Below
 */


 class Solution {
    public int maxProfit(int[] prices) {
        // initialize minValue and set it to max integer value
        // initialize maxProfit and set it to 0
        // iterate through prices int[]
        // set minValue to min and maxProfit to max
        // return max Profit

        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price: prices) {
            minValue = Math.min(minValue, price);
            maxProfit = Math.max(maxProfit, price - minValue);
        }

        return maxProfit;
        
    }
}