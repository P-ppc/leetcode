class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        i = 1
        count = 0
        pre = 0
        pre_pre = 0
        while i <= n:
            if i == 1:
                count = 1
            elif i == 2:
                count = 2
                pre = 1
            else:
                pre_pre = pre
                pre = count
                count = pre + pre_pre
            i += 1
        
        return count