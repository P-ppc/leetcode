/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var complexNumberMultiply = function(a, b) {
    let [, real1, imaginary1] = a.match(/(.*)\+(.*)i/),
        [, real2, imaginary2] = b.match(/(.*)\+(.*)i/),
        real = parseInt(real1) * parseInt(real2) - parseInt(imaginary1) * parseInt(imaginary2),
        imaginary = parseInt(real1) * parseInt(imaginary2) + parseInt(real2) * parseInt(imaginary1)
    
    return `${real}+${imaginary}i`
};