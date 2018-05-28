class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        sum_map = { n: True }
        while n != 1:
            s = 0
            while n >= 10:
                s += pow(n % 10, 2)
                n /= 10
            s += pow(n, 2)
            n = s
            if sum_map.get(s) != None:
                return False
            else:
                sum_map[s] = True
        return True