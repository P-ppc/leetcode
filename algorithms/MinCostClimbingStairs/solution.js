/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    let minCosts = []
    
    cost.forEach(c => {
        let length = minCosts.length
        if (length < 2) {
            minCosts.push(c)
        } else {
            minCosts.push(c + Math.min(minCosts[length - 2], minCosts[length - 1]))
        }
    })
    
    let length = minCosts.length
    return length < 2 ? 0 : Math.min(minCosts[length - 2], minCosts[length - 1])
};