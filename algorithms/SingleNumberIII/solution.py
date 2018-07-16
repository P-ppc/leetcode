class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        temp = 0
        
        for num in nums:
            temp ^= num
        
        # find the value of last 1
        # or this: v = temp & ~ (tmep - 1)
        v = temp & -temp
        
        res_0 = 0
        res_1 = 0
        for num in nums:
            if v & num == v:
                res_0 ^= num
            else:
                res_1 ^= num
        
        return [res_0, res_1]