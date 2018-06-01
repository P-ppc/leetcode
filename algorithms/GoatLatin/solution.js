/**
 * @param {string} S
 * @return {string}
 */
var toGoatLatin = function(S) {
    let vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'],
        words = S.split(' '),
        res = ''
    
    for (let i = 0; i < words.length; i++) {
        let word = words[i]
        if (res.length != 0) {
            res += ' '
        }
        
        if (vowels.findIndex(vowel => word[0] === vowel) === -1) {
            word = word.substr(1) + word[0]
        }
        word += 'ma'
        for (let j = 0; j <= i; j++) {
            word += 'a'
        }
        res += word
    }
    return res
};