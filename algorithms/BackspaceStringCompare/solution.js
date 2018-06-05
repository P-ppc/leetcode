/**
 * @param {string} S
 * @param {string} T
 * @return {boolean}
 */
var backspaceCompare = function(S, T) {
    let sStack = [],
        tStack = []
    
    S.split('').forEach(c => {
        if (c !== '#') {
            sStack.push(c)
        } else if (sStack.length > 0) {
            sStack.pop()
        }
    })
    
    T.split('').forEach(c => {
        if (c !== '#') {
            tStack.push(c)
        } else if (tStack.length > 0) {
            tStack.pop()
        }
    })
    
    return sStack.join('') === tStack.join('')
};