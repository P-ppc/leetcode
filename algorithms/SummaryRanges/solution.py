class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        length = len(nums)
        i = j = 0        
        res = []
        
        if length == 0:
            return res
        
        while j < length:
            if j > 0 and nums[j - 1] + 1 < nums[j]:
                res.append('%d->%d' % (nums[i], nums[j - 1]) if j - 1 > i else str(nums[i]))
                i = j
            j += 1
                
        res.append('%d->%d' % (nums[i], nums[j - 1]) if j - 1 > i else str(nums[i]))
                
        return res