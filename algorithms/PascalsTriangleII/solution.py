class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = [1]
        temp = []
        for i in range(1, rowIndex + 1):
            for j in range(0, i + 1):
                if j == 0:
                    temp.append(res[j])
                elif j == len(res):
                    temp.append(res[j - 1])
                else:
                    temp.append(res[j - 1] + res[j])
            res = temp
            temp = []
        return res