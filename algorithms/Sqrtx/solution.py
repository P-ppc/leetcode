class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        low = 0
        high = x
        
        while low <= high:
            mid = (low + high) / 2
            mid_power = mid * mid
            
            if mid_power > x:
                high = mid - 1
            elif mid_power < x:
                low = mid + 1
            else:
                return mid
        
        return high