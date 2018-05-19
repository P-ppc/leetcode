class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        int_map = {}
        for num in nums:
            if int_map.get(num) == None:
                int_map[num] = True
            else:
                return True
        return False