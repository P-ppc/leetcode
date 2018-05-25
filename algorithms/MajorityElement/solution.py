class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        visited_map = {}
        for num in nums:
            if visited_map.get(num) == None:
                visited_map[num] = 1
            else:
                visited_map[num] += 1
            if visited_map[num] > len(nums) / 2:
                return num