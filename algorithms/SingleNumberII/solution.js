/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let bitMap = new Array(32),
        res = 0
    
    bitMap.fill(0)
    
    for (let i = 0; i < 32; i++) {
        nums.forEach(num => {
            bitMap[i] += num >> i & 1
        })
        
        res |= bitMap[i] % 3 << i
    }
    
    return res
};