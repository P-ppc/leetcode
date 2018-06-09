/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let i = 0,
        j = s.length - 1
    
    while (i < j) {
        let start = s[i],
            end = s[j]
        
        if (!(('a' <= start && start <= 'z') || ('A' <= start && start <= 'Z') || ('0' <= start && start <= '9'))) {
            i++
        } else if (!(('a' <= end && end <= 'z') || ('A' <= end && end <= 'Z') || ('0' <= end && end <= '9'))) {
            j--
        } else if (start.toLowerCase() === end.toLowerCase()) {
            i++
            j--
        } else {
            return false
        }
    }
    
    return true
};