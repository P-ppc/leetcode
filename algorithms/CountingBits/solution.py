class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        dp = [0, 1]
        
        for i in xrange(2, num + 1):
            if i % 2 == 0:
                # count of i == count of (i >> 1)
                dp.append(dp[i >> 1])
            else:
                # count of i = count of (i - 1) + 1
                dp.append(dp[i - 1] + 1)
            
        return dp[:num + 1]