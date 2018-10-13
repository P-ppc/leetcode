class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        
        count = 0
        pre = 0
        
        for i in xrange(1, len(nums)):
            if nums[pre] == nums[i]:
                count += 1
                if count < 2:
                    pre += 1
                    nums[pre] = nums[i]
            else:
                pre += 1
                nums[pre] = nums[i]
                count = 0
        
        return pre + 1
            