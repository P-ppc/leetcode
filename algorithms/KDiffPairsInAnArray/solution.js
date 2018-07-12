/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    if (k < 0) return 0
    
    let parisMap = {},
        valueMap = {},
        res = 0
    
    nums.forEach(num => {
        let p1 = num + k,
            p2 = num - k
        
        if (valueMap[p1]) {
            let max = Math.max(p1, num),
                min = Math.min(p1, num)
            if (!parisMap[`${max}x${min}`]) {
                parisMap[`${max}x${min}`] = true
                res++
            }
        }
        if (valueMap[p2]) {
            let max = Math.max(p2, num),
                min = Math.min(p2, num)
            if (!parisMap[`${max}x${min}`]) {
                parisMap[`${max}x${min}`] = true
                res++
            }
        }
        valueMap[num] = true
    })
    
    return res
};