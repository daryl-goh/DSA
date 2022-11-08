class Solution {
    public int bestTimeToBuyAndSellStock(int[] prices) {
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