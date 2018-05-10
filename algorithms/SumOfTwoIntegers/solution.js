/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
var getSum = function(a, b) {
    while (b != 0) {
        let c = a & b; //carry
        a ^= b; //add 
        b = c << 1;
    }
    return a;
};