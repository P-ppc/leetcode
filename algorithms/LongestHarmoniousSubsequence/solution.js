/**
 * @param {number[]} nums
 * @return {number}
 */
var findLHS = function(nums) {
    let maxLength = 0,
        harmoniousMap = new Map()
    
    nums.forEach(num => {
        let prevKey = `${num - 1}X${num}`,
            nextKey = `${num}X${num + 1}`
        
        if (harmoniousMap.get(prevKey) === undefined) {
            harmoniousMap.set(prevKey, {
                length: 1,
                base: num,
                isHarmonious: false
            })
        } else {
            harmoniousMap.get(prevKey).length++
            if (harmoniousMap.get(prevKey).base !== num) {
                harmoniousMap.get(prevKey).isHarmonious = true
            }
            if (harmoniousMap.get(prevKey).isHarmonious) {
                maxLength = Math.max(maxLength, harmoniousMap.get(prevKey).length)
            }
        }
        
        if (harmoniousMap.get(nextKey) === undefined) {
            harmoniousMap.set(nextKey, {
                length: 1,
                base: num,
                isHarmonious: false
            })
        } else {
            harmoniousMap.get(nextKey).length++
            if (harmoniousMap.get(nextKey).base !== num) {
                harmoniousMap.get(nextKey).isHarmonious = true
            }
            if (harmoniousMap.get(nextKey).isHarmonious) {
                maxLength = Math.max(maxLength, harmoniousMap.get(nextKey).length)
            }
        }
    })
    
    return maxLength
};