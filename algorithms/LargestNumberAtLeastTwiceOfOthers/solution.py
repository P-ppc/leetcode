class Solution(object):
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_index = -1
        second_max_index = -1
        
        for i in range(len(nums)):
            if max_index == -1:
                max_index = i
            elif nums[i] >= nums[max_index]:
                second_max_index = max_index
                max_index = i
            elif nums[max_index] > nums[i] and (second_max_index == -1 or nums[i] >= nums[second_max_index]):
                second_max_index = i
        
        if second_max_index != -1 and nums[max_index] < nums[second_max_index] * 2:
            return -1
        
        return max_index