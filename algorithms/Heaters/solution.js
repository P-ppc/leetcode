/**
 * @param {number[]} houses
 * @param {number[]} heaters
 * @return {number}
 */
var findRadius = function(houses, heaters) {
    let res = 0
    heaters.sort((a, b) => a - b)
    
    houses.forEach(house => {
        let low = 0,
            high = heaters.length - 1
        
        while (low <= high) {
            let mid = parseInt((low + high) / 2)
            if (heaters[mid] < house) {
                low = mid + 1
            } else if (heaters[mid] > house) {
                high = mid - 1
            } else {
                low = mid
                break
            }
        }
        
        let distance
        if (low === 0) {
            distance = heaters[low] - house
        } else if (low === heaters.length) {
            distance = house - heaters[low - 1]
        } else {
            distance = Math.min(heaters[low] - house, house - heaters[low - 1])
        }
        
        res = Math.max(res, distance)
    })
    
    return res
};