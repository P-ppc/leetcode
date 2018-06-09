/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let sMap = {},
        tMap = {}
    
    for (let i = 0; i < s.length; i++) {
        let sC = s[i],
            tC = t[i]
        
        if (sMap[sC] === undefined && tMap[tC] === undefined) {
            sMap[sC] = tC
            tMap[tC] = sC
        } else if (sMap[sC] !== tC || tMap[tC] !== sC) {
            return false
        }
    }
    
    return true
};