class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        nums1_copy = []
        for i in range(0, m):
            nums1_copy.append(nums1[i])
        
        i = 0
        j = 0
        while i < m and j < n:
            nums1[i + j] = min(nums1_copy[i], nums2[j])
            if nums1_copy[i] <= nums2[j]:
                i += 1
            else:
                j += 1
        
        while i < m:
            nums1[i + j] = nums1_copy[i]
            i += 1
        while j < n:
            nums1[i + j] = nums2[j]
            j += 1
            