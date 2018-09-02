/**
 * @param {number[]} timeSeries
 * @param {number} duration
 * @return {number}
 */
var findPoisonedDuration = function(timeSeries, duration) {
    let res = 0,
        lastTime = -1
    
    timeSeries.forEach(time => {
        res += (lastTime != -1 ? Math.min(time - lastTime, duration) : 0)
        lastTime = time
    })
    res += lastTime != -1 ? duration : 0
    
    return res
};