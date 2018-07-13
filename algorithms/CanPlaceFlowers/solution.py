class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        pre = 0
        count = 0
        
        for i in range(len(flowerbed)):
            if (pre == 0 and flowerbed[i] == 0) and ((i + 1 < len(flowerbed) and flowerbed[i + 1] == 0) or i + 1 == len(flowerbed)):
                count += 1
                flowerbed[i] = 1
            pre = flowerbed[i]
                
        return count >= n