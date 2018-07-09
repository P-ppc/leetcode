class Solution(object):
    def findUnsortedSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        start = None
        end = None
        max_value = None
        min_value = None
        
        for i in range(len(nums)):
            if i > 0 and start == None and nums[i - 1] > nums[i]:
                start = i - 1
                end = i
                max_value = nums[i - 1]
                min_value = nums[i]
            elif max_value != None and max_value < nums[i]:
                max_value = nums[i]
            elif max_value != None and max_value > nums[i]:
                end = i
            if min_value != None and nums[i] < min_value:
                min_value = nums[i]
        
        if start != None:
            for i in range(start):
                if nums[i] > min_value:
                    start = i
                    break
        
        return end - start + 1 if end != None and start != None else 0
        