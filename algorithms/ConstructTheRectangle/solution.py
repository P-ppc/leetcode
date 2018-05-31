class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        L = W = int(math.sqrt(area))
        while W > 0:
            L = area / W
            mod = area % W
            if mod == 0:
                break
            W -= 1
        return [L, W]