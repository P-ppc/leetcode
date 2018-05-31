/**
 * @param {number} area
 * @return {number[]}
 */
var constructRectangle = function(area) {
    let L = W = parseInt(Math.sqrt(area))
    
    while (W > 0) {
        L = area / W
        if (area % W === 0) {
            break
        }
        W -= 1
    }
    return [L, W]
};