class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        low = 0
        high = num
        
        while low <= high:
            mid = (low + high) / 2
            mid_power = mid * mid
            
            if mid_power > num:
                high = mid - 1
            elif mid_power < num:
                low = mid + 1
            else:
                return True
        
        return False