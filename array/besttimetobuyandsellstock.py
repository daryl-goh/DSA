class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        # i = buy, j = sell
        i , j = 0, 1
        profit = 0
        while j < len(prices):
            currentProfit =  prices[j] - prices[i]
            if prices[i] < prices[j]:
                profit = max(currentProfit, profit)
            else:
                i = j
            j += 1
        return profit