class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        res = []
        for i in xrange(1 << n):
            res.append(i ^ (i >> 1))
        return res
        