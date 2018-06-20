/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    prefix = null
    
    for (let i = 0; i < strs.length; i++) {
        let str = strs[i]
        if (prefix === null) {
            prefix = str
        } else {
            let tempPrefix = ''
            for (let j = 0; j < Math.min(prefix.length, str.length); j++) {
                if (prefix[j] === str[j]) {
                    tempPrefix += prefix[j]
                } else {
                    break
                }
            }
            prefix = tempPrefix
            if (prefix === '') {
                return prefix
            }
        }
    }
    
    return prefix === null ? '' : prefix
};