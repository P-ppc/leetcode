/**
 * @param {string} path
 * @return {string}
 */
var simplifyPath = function(path) {
    let stack = []
    
    path.split('/').forEach(part => {
        if (part != '' && part != '.' && part != '..')
            stack.push(part)
        else if (part == '..' && stack.length > 0)
            stack.pop()
    })
    
    return '/' + stack.join('/')
};