/**
 * @param {string} version1
 * @param {string} version2
 * @return {number}
 */
var compareVersion = function(version1, version2) {
    let versions1 = version1.split('.').map(v => parseInt(v)),
        versions2 = version2.split('.').map(v => parseInt(v))
    
    while (versions1.length > 0 && versions1[versions1.length - 1] == 0)
        versions1.pop()
    while (versions2.length > 0 && versions2[versions2.length - 1] == 0)
        versions2.pop()
    
    let length1 = versions1.length,
        length2 = versions2.length
    
    for (let i = 0; i < Math.min(length1, length2); i++) {
        if (versions1[i] > versions2[i])
            return 1
        else if (versions1[i] < versions2[i])
            return -1
    }
    
    if (length1 > length2)
        return 1
    else if (length1 < length2)
        return -1
    else
        return 0
};