/**
 * @param {string} S
 * @return {number}
 */
var scoreOfParentheses = function(S) {
    let stack = []
    
    for (let i = 0, c = S[i]; i < S.length; i++, c = S[i]) {
        let length = stack.length
        
        if (c == '(')
            stack.push(c)
        else if (stack[length - 1] == '(')
            stack[length - 1] = 1
        else
            stack[length - 2] = 2 * stack.pop()
        
        let v = 0
        while (stack.length > 0 && stack[stack.length - 1] != '(')
            v += stack.pop()
        if (v > 0)
            stack.push(v)
    }
    
    return stack.length > 0 ? stack[0] : 0
};