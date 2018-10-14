/**
 * @param {number[]} temperatures
 * @return {number[]}
 */
var dailyTemperatures = function(temperatures) {
    let length = temperatures.length,
        res = new Array(length),
        stack = []
    res.fill(0)
    
    for (let i = 0; i < length; i++) {
        while (stack.length > 0 && stack[stack.length - 1].value < temperatures[i]) {
            let e = stack.pop()
            res[e.index] = i - e.index
        }
        stack.push({ index: i, value: temperatures[i] })
    }
    
    return res
};