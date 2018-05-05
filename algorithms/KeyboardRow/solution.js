/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    // js didn't support Long Integer, So we use another way to solve problem
    let firstLine = 'qwertyuiop',
        secondLine = 'asdfghjkl',
        lastLine = 'zxcvbnm'
    let array = []
    words.forEach(word => {
        let first = second = last = 0
        Array.from(new Set(word.toLowerCase().split(''))).forEach(char => {
            if (firstLine.indexOf(char) !== -1) first = 1
            else if (secondLine.indexOf(char) !== -1) second = 1
            else if (lastLine.indexOf(char) !== -1) last = 1
        })
        if (first + second + last === 1) {
            array.push(word)
        }
    })
    return array
};