/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    let res = '1'
    for (let i = 1; i < n; i++) {
        let stack = '',
            temp = ''
        res.split('').forEach(c => {
            if (stack.length > 0 && stack[0] !== c) {
                temp += String(stack.length) + stack[0]
                stack = c
            } else {
                stack += c
            }
        })
        if (stack.length > 0) {
            temp += String(stack.length) + stack[0]
        }
        res = temp
    }
    return res
};