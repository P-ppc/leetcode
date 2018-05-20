class Solution(object):
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        for row in A:
            length = len(row)
            for i in range(0, length):
                row[i] ^= 1
                
            start = 0
            end = length - 1
            while start < end:
                row[start], row[end] = row[end], row[start]
                start += 1
                end -= 1
        return A