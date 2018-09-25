/**
 * @param {number} A
 * @param {number} B
 * @param {number} C
 * @param {number} D
 * @param {number} E
 * @param {number} F
 * @param {number} G
 * @param {number} H
 * @return {number}
 */
var computeArea = function(A, B, C, D, E, F, G, H) {
    let area = (C - A) * (D - B) + (G - E) * (H - F),
        x1 = Math.max(A, E),
        x2 = Math.min(C, G),
        y1 = Math.max(B, F),
        y2 = Math.min(D, H),
        intersectionArea = x2 > x1 && y2 > y1 ? (x2 - x1) * (y2 - y1) : 0
    
    return area - intersectionArea
};