class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        # the min cost of every stair
        min_costs = []
        
        for c in cost:
            if len(min_costs) < 2:
                min_costs.append(c)
            else:
                min_costs.append(c + min(min_costs[-2], min_costs[-1]))
        
        return 0 if len(min_costs) < 2 else min(min_costs[-2], min_costs[-1])