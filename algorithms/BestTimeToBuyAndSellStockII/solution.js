/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let currentStock = null,
        maxProfit = 0
    
    for (let i = 0; i < prices.length; i++) {
        if (currentStock === null && i + 1 < prices.length && prices[i + 1] > prices[i]) {
            currentStock = prices[i]
        } else if (currentStock !== null && ((i + 1 < prices.length && prices[i + 1] < prices[i]) || i + 1 === prices.length)) {
            maxProfit += prices[i] - currentStock
            currentStock = null
        }
    }
    
    return maxProfit
};