class Solution(object):
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        self.backtrack(0, nums, [], res)
        return res
    
    def backtrack(self, beg, nums, temp, res):
        if beg <= len(nums):
            res.append(temp)
            i = beg
            while i < len(nums):
                num = nums[i]
                t = temp[:]
                t.append(nums[i])
                self.backtrack(i + 1, nums, t, res)
                while i + 1 < len(nums) and nums[i + 1] == num:
                    i += 1
                i += 1
                