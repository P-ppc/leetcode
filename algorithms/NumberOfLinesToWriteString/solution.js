/**
 * @param {number[]} widths
 * @param {string} S
 * @return {number[]}
 */
var numberOfLines = function(widths, S) {
    let lines = [],
        line = '',
        lineWidth = 0
    
    S.split('').forEach(c => {
        let cWidth = widths[c.charCodeAt(0) - 'a'.charCodeAt(0)]
        if (lineWidth + cWidth > 100) {
            lines.push(line)
            line = c
            lineWidth = cWidth
        } else {
            line += c
            lineWidth += cWidth
        }
    })
    return [line.length > 0 ? lines.length + 1 : lines.length, lineWidth]
};