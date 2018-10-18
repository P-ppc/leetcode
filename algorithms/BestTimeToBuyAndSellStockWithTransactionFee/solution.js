/**
 * @param {number[]} prices
 * @param {number} fee
 * @return {number}
 */
var maxProfit = function(prices, fee) {
    if (prices.length == 0)
        return 0
    
    let maxProfit = 0,
        holder = prices[0],
        maxPrice = prices[0]
    
    for (let i = 1; i < prices.length; i++) {
        let price = prices[i]
        
        if (price > maxPrice)
            maxPrice = price
        else if (maxPrice - price >= fee) {
            if (maxPrice - holder > fee)
                 maxProfit += maxPrice - holder - fee
            holder = price
            maxPrice = price
        } else if (price < holder) {
            holder = price
            maxPrice = price
        }
    }
    
    if (maxPrice - holder > fee)
        maxProfit += maxPrice - holder - fee
    return maxProfit
};