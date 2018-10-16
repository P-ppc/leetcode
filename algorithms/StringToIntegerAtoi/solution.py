class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        s = str.strip()
        if len(s) == 0:
            return 0
        
        val = 0
        is_negative = False
        i = 1
        
        if s[0] == '+' or s[0] == '-':
            is_negative = False if s[0] == '+' else True
        elif s[0].isdigit():
            val = ord(s[0]) - 48
        else:
            return 0
            
        max_int = 2147483647
        min_int = -2147483648
        special_int = 214748364
        
        while i < len(s) and s[i].isdigit():
            v = ord(s[i]) - 48
            if val > special_int:
                return min_int if is_negative else max_int
            elif val == special_int:
                if is_negative and v > 8:
                    return min_int
                elif not is_negative and v > 7:
                    return max_int
            val = val * 10 + v
            i += 1
        
        return -val if is_negative else val
    