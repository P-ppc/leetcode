class Solution(object):
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # maximum product must be max1 * max2 * max3 or max1 * min1 * min2
        
        max1 = - sys.maxint
        max2 = - sys.maxint
        max3 = - sys.maxint
        
        min1 = sys.maxint
        min2 = sys.maxint
        
        for num in nums:
            if num >= max1:
                max3 = max2
                max2 = max1
                max1 = num
            elif num >= max2:
                max3 = max2
                max2 = num
            elif num >= max3:
                max3 = num
            
            if num <= min1:
                min2 = min1
                min1 = num
            elif num <= min2:
                min2 = num
        
        return max(max1 * max2 * max3, max1 * min1 * min2)