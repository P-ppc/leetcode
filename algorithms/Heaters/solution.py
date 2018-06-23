class Solution(object):
    def findRadius(self, houses, heaters):
        """
        :type houses: List[int]
        :type heaters: List[int]
        :rtype: int
        """
        res = 0
        
        houses.sort()
        heaters.sort()
        i = 0
        
        for house in houses:
            while i < len(heaters) - 1 and abs(heaters[i + 1] - house) <= abs(heaters[i] - house):
                i += 1
            res = max(res, abs(heaters[i] - house))
        
        return res