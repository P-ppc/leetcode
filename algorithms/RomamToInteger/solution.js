/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let res = 0
    let stack = ''
    let map = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000,
        IV: 4,
        IX: 9,
        XL: 40,
        XC: 90,
        CD: 400,
        CM: 900
    }
    s.split('').forEach(c => {
        stack += c
        if (stack.length === 2 && map[stack] !== undefined) {
            res += map[stack]
            stack = ''
        } else if (stack.length === 2) {
            res += map[stack[0]]
            stack = stack[1]
        }
    })
    
    res += map[stack] || 0
    return res
};