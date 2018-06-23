class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        element_map = {}
        res = []
        
        for num in nums1:
            if element_map.get(num) == None:
                element_map[num] = 1
            else:
                element_map[num] += 1
        
        for num in nums2:
            if element_map.get(num) != None and element_map[num] > 0:
                element_map[num] -= 1
                res.append(num)
        
        return res