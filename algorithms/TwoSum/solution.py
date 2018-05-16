class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        for i in range(0, len(nums)):
            if map.get(nums[i]) != None:
                return [map.get(nums[i]), i]
            else:
                map[target - nums[i]] = i