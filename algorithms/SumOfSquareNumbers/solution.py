class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        if c < 0: return False
        
        radical = int(math.sqrt(c))
        
        beg = 0
        while beg <= radical:
            temp = beg * beg + radical * radical
            if temp == c:
                return True
            elif temp > c:
                radical -= 1
            else:
                beg += 1
        
        return False