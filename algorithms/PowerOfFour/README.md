# Power Of Four
Use recursion can easy to solve this problem, like below:
```
class Solution(object):
    def isPowerOfFour(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 1: return True
        
        while num > 4:
            mod = num % 4
            num /= 4
            if mod != 0:
                return False
        return num == 4
```
But we can't use iteration to solve this problem, so the bitwise is the solution and 0X55555555 is special value