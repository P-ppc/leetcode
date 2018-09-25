class Solution(object):
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        area = (C - A) * (D - B) + (G - E) * (H - F)
        
        x1 = max(A, E)
        x2 = min(C, G)
        y1 = max(B, F)
        y2 = min(D, H)
        intersection_area = (x2 - x1) * (y2 - y1) if x2 > x1 and y2 > y1 else 0
        
        return area - intersection_area