class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(nums, [], res)
        return res
    
    def backtrack(self, nums, temp, res):
        if len(nums) == 0:
            res.append(temp)
        else:
            for num in nums:
                temp_nums = nums[:]
                temp_nums.remove(num)
                t = temp[:]
                t.append(num)
                self.backtrack(temp_nums, t, res)