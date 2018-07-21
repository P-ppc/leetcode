class Solution(object):
    def binaryGap(self, N):
        """
        :type N: int
        :rtype: int
        """
        max_gap = 0
        pre = -1
        
        for i in range(32):
            if N >> i & 1 == 1:
                max_gap = max(max_gap, i - pre) if pre != -1 else 0
                pre = i
        
        return max_gap