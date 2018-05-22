class NumArray(object):

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.sum_map = {}
        for i in range(0, len(nums)):
            if i == 0:
                self.sum_map[i] = nums[i]
            else:
                self.sum_map[i] = self.sum_map[i - 1] + nums[i] 

    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        if i == 0:
            return self.sum_map[j]
        return self.sum_map[j] - self.sum_map[i - 1]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(i,j)