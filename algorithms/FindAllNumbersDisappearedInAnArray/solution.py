class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = []
        for i in range(len(nums) + 1):
            res.append(i)
            
        for num in nums:
            res[num] = 0
        
        # remove 0 to the end
        effective_length = 0
        pos = 0
        for i in range(len(res)):
            if res[i] != 0:
                res[pos] = res[i]
                pos += 1
                effective_length += 1
        
        return res[:effective_length]