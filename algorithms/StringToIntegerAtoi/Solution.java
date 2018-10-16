class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0)
            return 0;
        
        int val = 0,
            i = 1;
        boolean isNegative = false;
        
        char prefix = str.charAt(0);
        if (prefix == '+' || prefix == '-')
            isNegative = prefix == '-' ? true : false;
        else if (Character.isDigit(prefix))
            val = prefix - '0';
        else
            return 0;
        
        int maxInt = 2147483647,
            minInt = -2147483648,
            spInt = 214748364;
        
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int v = str.charAt(i++) - '0';
            if (val > spInt)
                return isNegative ? minInt : maxInt;
            else if (val == spInt) {
                if (isNegative && v > 8)
                    return minInt;
                else if (!isNegative && v > 7)
                    return maxInt;
            }
            val = val * 10 + v;
        }
        
        return isNegative ? -val : val;
    }
}