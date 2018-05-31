class Solution(object):
    def imageSmoother(self, M):
        """
        :type M: List[List[int]]
        :rtype: List[List[int]]
        """
        res = []
        
        for i in range(0, len(M)):
            row = []
            for j in range(0, len(M[0])):
                points = [M[i][j]]
                if j >= 1:
                    points.append(M[i][j - 1])
                if j + 1 < len(M[0]):
                    points.append(M[i][j + 1])
                if i >= 1:
                    points.append(M[i - 1][j])
                    if j >= 1:
                        points.append(M[i - 1][j - 1])
                    if j + 1 < len(M[0]):
                        points.append(M[i - 1][j + 1])
                if i + 1 < len(M):
                    points.append(M[i + 1][j])
                    if j >= 1:
                        points.append(M[i + 1][j - 1])
                    if j + 1 < len(M[0]):
                        points.append(M[i + 1][j + 1])
                row.append(sum(points) / len(points))
            res.append(row)
            
        return res