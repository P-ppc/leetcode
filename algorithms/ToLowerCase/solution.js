/**
 * @param {string} str
 * @return {string}
 */
var toLowerCase = function(str) {
    return str.split('').map(c => 'A' <= c && 'Z' >= c ? String.fromCharCode(c.charCodeAt(0) + 32) : c).join('')
};