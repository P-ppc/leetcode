class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        
        holder = prices[0]
        max_price = prices[0]
        max_profit = 0
        
        for i in xrange(1, len(prices)):
            price = prices[i]
            if price > max_price:
                max_price = price
            elif max_price - price >= fee:
                if max_price - holder - fee > 0:
                    max_profit += max_price - holder - fee
                holder = price
                max_price = price
            elif price < holder:
                holder = price
                max_price = price
                
        if max_price - holder > fee:
            max_profit += max_price - holder - fee
        return max_profit
        