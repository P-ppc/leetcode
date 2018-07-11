/**
 * @param {string} s
 * @param {string} p
 * @return {number[]}
 */
var findAnagrams = function(s, p) {
    let res = [],
        patternLength = p.length,
        patternMap = {}
        beg = 0,
        length = 0,
        i = 0
    
    for (let j = 0; j < patternLength; j++) {
        if (patternMap[p[j]] === undefined) patternMap[p[j]] = 0
        patternMap[p[j]] += 1
    }
    
    let copyPatternMap = JSON.parse(JSON.stringify(patternMap))
    
    while (i < s.length) {
        if (length < patternLength) {
            if (copyPatternMap[s[i]] === undefined) {
                copyPatternMap = JSON.parse(JSON.stringify(patternMap))
                length = 0
                i++
                beg = i
            } else if (copyPatternMap[s[i]] > 0) {
                copyPatternMap[s[i]]--
                length++
                i++
            } else {
                while (s[beg++] !== s[i]) {
                    copyPatternMap[s[beg - 1]]++
                    length--
                }
                i++
            }
        }
        
        if (length === patternLength) {
            res.push(beg)
            copyPatternMap[s[beg]]++
            length--
            beg++
        }
    }
    
    return res
};