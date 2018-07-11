/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let res = 0,
        MAX_INTEGER_BOUNDARY = parseInt((Math.pow(2, 31) - 1) / 10),
        MIN_INTEGER_BOUNDARY = parseInt(Math.pow(-2, 31) / 10)
    
    while (x != 0) {
        let pop = x % 10
        x = parseInt(x / 10)
        
        if (res > MAX_INTEGER_BOUNDARY || (res === MAX_INTEGER_BOUNDARY && pop > 7)) return 0
        if (res < MIN_INTEGER_BOUNDARY || (res === MIN_INTEGER_BOUNDARY && pop < -8)) return 0
        res = res * 10 + pop
    }
    
    return res
};