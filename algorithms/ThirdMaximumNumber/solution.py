class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_num = None
        second_num = None
        third_num = None
        
        for num in nums:
            if max_num == None:
                max_num = num
            else:
                max_num = max(max_num, num)
        
        for num in nums:
            if num == max_num:
                continue
            elif second_num == None:
                second_num = num
            else:
                second_num = max(second_num, num)
        
        for num in nums:
            if num == max_num or num == second_num:
                continue
            elif third_num == None:
                third_num = num
            else:
                third_num = max(third_num, num)
                
        return third_num if third_num != None else max_num