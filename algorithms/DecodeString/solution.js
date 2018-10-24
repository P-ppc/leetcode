/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function(s) {
    let stack = []
    
    s.split('').forEach(c => {
        if (c == ']') {
            let tempStr = ''
            while (stack.length > 0 && stack[stack.length - 1] != '[')
                tempStr = stack.pop() + tempStr
            stack.pop()
            
            let tempInt = ''
            while (stack.length > 0 && /\d+/.test(stack[stack.length - 1]))
                tempInt = stack.pop() + tempInt
            
            stack.push(tempStr.repeat(parseInt(tempInt)))
        } else
            stack.push(c)
    })
    
    return stack.join('')
};