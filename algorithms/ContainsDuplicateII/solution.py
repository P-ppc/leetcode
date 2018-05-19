class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        int_map = {}
        for i in range(0, len(nums)):
            if int_map.get(nums[i]) == None:
                int_map[nums[i]] = i
            elif i - int_map.get(nums[i]) <= k:
                return True
            else:
                int_map[nums[i]] = i
        return False