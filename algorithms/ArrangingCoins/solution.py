class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        remain = n
        
        while remain > 0:
            if remain >= (count + 1):
                count += 1
                remain -= count
            else:
                break
        
        return count