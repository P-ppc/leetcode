class Solution(object):
    def findShortestSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums_map = {}
        most_nums = []
        max_count = 0
        
        for i in range(0, len(nums)):
            num = nums[i]
            if nums_map.get(num) == None:
                nums_map[num] = {
                    'start': i,
                    'end': i,
                    'count': 1
                }
            else:
                nums_map[num]['end'] = i
                nums_map[num]['count'] += 1
            
            if nums_map[num]['count'] > max_count:
                max_count = nums_map[num]['count']
                most_nums = [num]
            elif nums_map[num]['count'] == max_count:
                most_nums.append(num)
        
        return min([nums_map[num]['end'] - nums_map[num]['start'] + 1 for num in most_nums])
            