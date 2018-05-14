/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = []
    s.split('').forEach(c => {
        let value = stack[stack.length - 1]
        if (value === '(' && c === ')') stack.length = stack.length - 1
        else if (value === '[' && c === ']') stack.length = stack.length - 1
        else if (value === '{' && c === '}') stack.length = stack.length - 1
        else stack.push(c)
    })
    return stack.length === 0
};