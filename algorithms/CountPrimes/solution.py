class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        prime_list = [True] * max(n, 2)
        prime_list[0] = prime_list[1] = False
        
        for i in range(2, n):
            if prime_list[i]:
                j = i * 2
                while j < n:
                    prime_list[j] = False
                    j += i
        
        count = 0
        for i in range(2, n):
            if prime_list[i]:
                count += 1
        return count