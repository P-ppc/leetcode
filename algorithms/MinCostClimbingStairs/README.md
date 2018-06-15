# Min Cost Climbing Stairs
This problem is easy to solve by dynamic programming, the recursion solution is like below:
```
class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """        
        if len(cost) < 2:
            return 0
        elif len(cost) == 2:
            return min(cost[0], cost[1])
        else:
            return min(self.minCostClimbingStairs(cost[:-2]) + cost[-2], self.minCostClimbingStairs(cost[:-1]) + cost[-1])
```