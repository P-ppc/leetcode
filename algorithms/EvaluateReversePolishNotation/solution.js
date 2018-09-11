/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    let stack = []
    
    tokens.forEach(token => {
        if (['+', '-', '*', '/'].indexOf(token) !== -1) {
            let value2 = parseInt(stack.pop()),
                value1 = parseInt(stack.pop()),
                value = 0
            if (token == '+')
                value = value1 + value2
            else if (token == '-')
                value = value1 - value2
            else if (token == '*')
                value = value1 * value2
            else if (token == '/')
                value = parseInt(value1 / value2)
            stack.push(value)
        } else {
            stack.push(token)
        }
    })
    
    return stack.length > 0 ? parseInt(stack[0]) : 0
};