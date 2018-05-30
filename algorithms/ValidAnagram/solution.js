/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length > t.length) {
        let temp = s
        s = t
        t = temp
    }
    
    let characterMap = {}
    
    s.split('').forEach(c => {
        if (characterMap[c] === undefined) characterMap[c] = 1
        else characterMap[c] += 1
    })
    
    for (let i = 0; i < t.length; i++) {
        let c = t[i]
        if (characterMap[c] === undefined || characterMap[c] === 0) return false
        else characterMap[c] -= 1
    }
    
    return true
};