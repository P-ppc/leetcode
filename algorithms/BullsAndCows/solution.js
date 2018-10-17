/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    let bullCount = 0,
        cowCount = 0,
        valueMap = {},
        guessRemains = []
    
    for (let i = 0; i < secret.length; i++) {
        if (secret[i] == guess[i])
            bullCount++
        else {
            if (valueMap[secret[i]] === undefined)
                valueMap[secret[i]] = 0
            valueMap[secret[i]]++
            guessRemains.push(guess[i])
        }
    }
    
    guessRemains.forEach(v => {
        if (valueMap[v] !== undefined && valueMap[v] > 0) {
            cowCount++
            valueMap[v]--
        }
    })
    
    return `${bullCount}A${cowCount}B`
};