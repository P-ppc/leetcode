# Remove Duplicates From Sorted Array
This problem is easy to solve by double pointers, like below:
```python
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        
        pre = 0
        for i in range(len(nums)):
            if nums[i] != nums[pre]:
                pre += 1
                nums[pre] = nums[i]
                    
        return pre + 1
        
```