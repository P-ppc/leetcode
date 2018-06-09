class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        res = []
        carry = 1
        
        for i in range(len(digits))[::-1]:
            sm = digits[i] + carry
            res.insert(0, sm % 10)
            carry = sm / 10
            
        return res if carry == 0 else [1] + res