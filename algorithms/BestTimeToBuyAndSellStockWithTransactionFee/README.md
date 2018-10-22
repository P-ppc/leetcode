# Best Time To Buy And Sell Stock With Transaction Fee
We can solve this problem by Greedy Algorithm, or use Dynamic Programming like below:
```python
class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        # profit of not hold stock in i
        not_holder = 0
        # profit of hold stock in i, of course it's -prices[0] when i = 0
        holder = -prices[0]
        
        for i in xrange(1, len(prices)):
            not_holder = max(not_holder, prices[i] + holder - fee)
            holder = max(holder, not_holder - prices[i])
        
        return max(holder, not_holder)
        
```