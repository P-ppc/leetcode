/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let total = 0,
        diffSum = 0,
        start = 0
    
    for (let i = 0; i < gas.length; i++) {
        if (diffSum < 0) {
            diffSum = 0
            start = i
        }
        diffSum += gas[i] - cost[i]
        total += gas[i] - cost[i]
    }
    
    return total >= 0 ? start : -1
};