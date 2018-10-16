/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    str = str.trim()
    if (str.length == 0)
        return 0
    
    let val = 0,
        isNegative = false,
        i = 1
    
    if (str[0] == '+' || str[0] == '-')
        isNegative = str[0] == '-' ? true : false
    else if ('0' <= str[0] && str[0] <= '9')
        val = str[0] - 0
    else
        return 0
    
    let maxInt = 2147483647,
        minInt = -2147483648,
        spInt = 214748364
    
    while (i < str.length && '0' <= str[i] && str[i] <= '9') {
        let v = str[i++] - 0
        if (val > spInt)
            return isNegative ? minInt : maxInt
        else if (val == spInt) {
            if (isNegative && v > 8)
                return minInt
            else if (!isNegative && v > 7)
                return maxInt
        }
        val = val * 10 + v
    }
    
    return isNegative ? -val : val
};