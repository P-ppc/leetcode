class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        total = 0
        diff_sum = 0
        start = 0
        
        for i in xrange(len(gas)):
            if diff_sum < 0:
                diff_sum = 0
                start = i
            diff_sum += gas[i] - cost[i]
            total += gas[i] - cost[i]
            
        return start if total >= 0 else -1