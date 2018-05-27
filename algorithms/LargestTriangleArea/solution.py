class Solution(object):
    def largestTriangleArea(self, points):
        """
        :type points: List[List[int]]
        :rtype: float
        """
        max_area = 0
        for point1 in points:
            for point2 in points:
                for point3 in points:
                    a = point1[0]
                    b = point1[1]
                    c = point2[0]
                    d = point2[1]
                    e = point3[0]
                    f = point3[1]
                    max_area = max(max_area, abs(a * d + b * e + c * f - a * f - b * c - d * e) / 2.0)
        return max_area