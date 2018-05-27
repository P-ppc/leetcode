class Solution(object):
    def countPrimeSetBits(self, L, R):
        """
        :type L: int
        :type R: int
        :rtype: int
        """
        count = 0
        for i in range(L, R + 1):
            one_count = 0
            while i != 0:
                i &= i - 1
                one_count += 1
            
            # 1 is not a prime
            if one_count == 1:
                continue
            
            # judge is prime
            x = one_count / 2
            while x > 1:
                if one_count % x == 0:
                    break
                else:
                    x -= 1
            else:
                count += 1
        
        return count