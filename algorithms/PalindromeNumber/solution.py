class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        array = []
        reverse_array = []
        while x > 0:
            mod = x % 10
            x = x / 10
            array.append(mod)
            reverse_array.insert(0, mod)
        
        for i in range(0, len(array)):
            if array[i] != reverse_array[i]:
                return False
        return True