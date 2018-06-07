    class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        res = ''
        carry = False
        i = len(num1) - 1
        j = len(num2) - 1
        
        while i >= 0 or j >= 0:
            a = ord(num1[i]) - ord('0') if i >= 0 else 0
            b = ord(num2[j]) - ord('0') if j >= 0 else 0
            sm = a + b + 1 if carry else a + b
            
            res = str(sm % 10) + res
            carry = sm >= 10
            
            i -= 1
            j -= 1
        
        return '1' + res if carry else res