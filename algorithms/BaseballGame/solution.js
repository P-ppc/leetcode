/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
    let scoreStack = []
    ops.forEach(op => {
        if (op === '+') {
            scoreStack.push(scoreStack[scoreStack.length - 2] + scoreStack[scoreStack.length - 1])
        } else if (op === 'C') {
            scoreStack.splice(scoreStack.length - 1, 1)
        } else if (op === 'D') {
            scoreStack.push(2 * scoreStack[scoreStack.length - 1])
        } else {
            scoreStack.push(parseInt(op))
        }
    })
    return scoreStack.reduce((x, y) => x + y, 0)
};