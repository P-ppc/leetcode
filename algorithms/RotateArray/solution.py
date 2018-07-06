class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        # this way use extra space
        length = len(nums)
        # avoid repeat
        k = k % length
        count = 0
        index = 0
        temp = nums[index]
        rotate_map = {}
        
        while count < length:
            if rotate_map.get(index) != None:
                index += 1
                temp = nums[index]
            rotate_map[index] = True
            
            next_index = index + k if index + k < length else index + k - length
            nums[next_index], temp, index = temp, nums[next_index], next_index
            count += 1
    