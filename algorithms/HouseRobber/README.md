# House Robber
This proble is easy to solve, like Min Cost Climbing Stairs, the better solution of Dynamic Programming is like below:
```python
class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        
        dp = [0] * length
        
        for i in xrange(length):
            dp[i] = max(nums[i] + (dp[i - 2] if i > 1 else 0), dp[i - 1] if i > 0 else 0)
            
        return dp[length - 1] if length > 0 else 0
```