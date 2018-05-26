class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        nums1_map = {}
        res = []
        for num in nums1:
            if nums1_map.get(num) == None:
                nums1_map[num] = True
                
        for num in nums2:
            if nums1_map.get(num) == True:
                res.append(num)
                del nums1_map[num]
        return res