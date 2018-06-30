class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        remains = {
            5: 0,
            10: 0
        }
        
        for bill in bills:
            if bill == 5:
                remains[5] += 1
            elif bill == 10:
                if remains[5] > 0:
                    remains[5] -= 1
                    remains[10] += 1
                else:
                    return False
            elif bill == 20:
                if remains[10] > 0 and remains[5] > 0:
                    remains[5] -= 1
                    remains[10] -= 1
                elif remains[5] >= 3:
                    remains[5] -= 3
                else:
                    return False
        
        return True