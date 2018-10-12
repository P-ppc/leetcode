class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        length = len(nums)
        reverse_products = [0] * length
        
        for i in xrange(length):
            reverse_products[length - 1 - i] = nums[length - 1 - i] if i == 0 else nums[length - 1 - i] * reverse_products[length - i]
        for i in xrange(length):
            nums[i] = nums[i] if i == 0 else nums[i] * nums[i - 1]
        
        reverse_products[0] = reverse_products[1]
        for i in xrange(1, length - 1):
            reverse_products[i] = nums[i - 1] * reverse_products[i + 1]
        reverse_products[-1] = nums[-2]
        
        return reverse_products