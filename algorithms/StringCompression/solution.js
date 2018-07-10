/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    let char = null,
        count = 0,
        length = 0
    
    chars.forEach(c => {
        if (char === null) {
            count = 1
            char = c
        } else if (char === c) {
            count++
        } else if (char !== c) {
            chars[length] = char
            length++
            
            if (count > 1) {
                let countStr = String(count)
                for (let j = 0; j < countStr.length; j++) {
                    chars[length] = countStr[j]
                    length++
                }
            }
            
            count = 1
            char = c
        }
    })
    
    chars[length] = char
    length++

    if (count > 1) {
        let countStr = String(count)
        for (let j = 0; j < countStr.length; j++) {
            chars[length] = countStr[j]
            length++
        }
    }
    
    return length
};