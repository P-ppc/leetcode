class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        return [num for num in range(left, right + 1) if self.isSelfDividingNumber(num)]
    
    def isSelfDividingNumber(self, num):
        origin_num = num
        while num > 0:
            mod = num % 10
            if mod == 0 or origin_num % mod != 0:
                return False
            num /= 10
        return True