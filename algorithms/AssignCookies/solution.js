/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort((a, b) => a - b)
    s.sort((a, b) => a - b)
    
    let count = 0,
        index = 0
        
    for (let i = 0; i < s.length; i++) {
        if (s[i] >= g[index]) {
            count++
            index++
            
            if (index == g.length) {
                break
            }
        }
    }

    return count
};