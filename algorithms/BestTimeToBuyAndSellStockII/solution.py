class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        current_stock = None
        max_profit = 0
        
        for i in range(0, len(prices)):
            # buy
            if current_stock == None and i + 1 < len(prices) and prices[i + 1] > prices[i]:
                current_stock = prices[i]
            # sell
            elif current_stock != None and ((i + 1 < len(prices) and prices[i + 1] < prices[i]) or i + 1 == len(prices)):
                max_profit += prices[i] - current_stock
                current_stock = None
        
        return max_profit