/**
 * @param {string} S
 * @return {number}
 */
var minAddToMakeValid = function(S) {
    let stack = []
    
    S.split('').forEach(c => {
        if (c == ')' && stack.length > 0 && stack[stack.length - 1] == '(')
            stack.pop()
        else
            stack.push(c)
    })
    return stack.length
};