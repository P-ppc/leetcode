class Solution(object):
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_length = 0
        harmonious_map = {}
        
        for num in nums:
            key_prev = str(num - 1) + 'X' + str(num)
            key_next = str(num) + 'X' + str(num + 1)
            if harmonious_map.get(key_prev) == None:
                harmonious_map[key_prev] = {
                    'length': 1,
                    'base': num,
                    'is_harmonious': False
                }
            else:
                harmonious_map[key_prev]['length'] += 1
                if harmonious_map[key_prev]['base'] != num:
                    harmonious_map[key_prev]['is_harmonious'] = True
                if harmonious_map[key_prev]['is_harmonious'] == True:
                    max_length = max(max_length, harmonious_map[key_prev]['length'])
            
            if harmonious_map.get(key_next) == None:
                harmonious_map[key_next] = {
                    'length': 1,
                    'base': num,
                    'is_harmonious': False
                }
            else:
                harmonious_map[key_next]['length'] += 1
                if harmonious_map[key_next]['base'] != num:
                    harmonious_map[key_next]['is_harmonious'] = True
                if harmonious_map[key_next]['is_harmonious'] == True:
                    max_length = max(max_length, harmonious_map[key_next]['length'])
            
        return max_length