class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res = []
        for i in range(0, numRows): 
            if len(res) == 0:
                res.append([1])
                continue
            last = res[-1]
            temp = [1]
            for j in range(0, len(last)):
                if j + 1 < len(last):
                    temp.append(last[j] + last[j + 1])
                else:
                    temp.append(last[j])
            res.append(temp)
        return res