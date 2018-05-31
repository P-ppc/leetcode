class Solution(object):
    def maxCount(self, m, n, ops):
        """
        :type m: int
        :type n: int
        :type ops: List[List[int]]
        :rtype: int
        """
        min_row_count = m
        min_col_count = n
        
        for op in ops:
            min_row_count = min(min_row_count, op[0])
            min_col_count = min(min_col_count, op[1])
        
        return min_row_count * min_col_count
        