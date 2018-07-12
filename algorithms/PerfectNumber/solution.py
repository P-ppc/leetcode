class Solution(object):
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num <= 1:
            return False
        
        factor_sum = 1
        i = 2
        
        while i <= math.sqrt(num):
            if num % i == 0:
                factor_sum += i + num / i
            i += 1
        
        return factor_sum == num