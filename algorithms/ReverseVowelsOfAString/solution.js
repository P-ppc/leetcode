/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    let vowels = ['a', 'e', 'i', 'o', 'u']
    s = s.split('')
    let start = 0,
        end = s.length - 1
    
    while (start < end) {
        if (vowels.findIndex(vowel => s[start].toLowerCase() === vowel) !== -1) {
            while (vowels.findIndex(vowel => s[end].toLowerCase() === vowel) === -1 && start < end) {
                end--
            }
            if (start === end) {
                break
            } else {
                let temp = s[start]
                s[start] = s[end]
                s[end] = temp
                start++
                end--
            }
        } else {
            start++
        }
    }
    
    return s.join('')
};