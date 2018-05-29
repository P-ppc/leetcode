/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0,
        minPrice = Number.MAX_VALUE
    
    prices.forEach(price => {
        minPrice = Math.min(minPrice, price)
        maxProfit = Math.max(maxProfit, price - minPrice)
    })
    
    return maxProfit
};