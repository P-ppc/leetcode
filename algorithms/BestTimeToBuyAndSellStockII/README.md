# Best Time To Buy And Sell Stock
This problem is easy to solve by Greedy Algorithm, like below:
```python
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        
        max_profit = 0
        holder = prices[0]
        max_price = prices[0]
        
        for i in xrange(1, len(prices)):
            price = prices[i]
            
            if price > max_price:
                max_price = price
            elif max_price > price:
                if max_price > holder:
                    max_profit += max_price - holder
                holder = price
                max_price = price
        
        if max_price > holder:
            max_profit += max_price - holder
            
        return max_profit
```
or like below:
```python
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        
        max_profit = 0
        for i in xrange(1, len(prices)):
            if prices[i] > prices[i - 1]:
                max_profit += prices[i] - prices[i - 1]
            
        return max_profit
```
or use Dynamic Programming like below:
```python
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        # profit of not hold stock in i
        not_holder = 0
        # profit of hold stock in i, of course it's -prices[0] when i = 0
        holder = -prices[0]
        
        for i in xrange(1, len(prices)):
            not_holder = max(not_holder, prices[i] + holder)
            holder = max(holder, not_holder - prices[i])
        
        return max(holder, not_holder)
```