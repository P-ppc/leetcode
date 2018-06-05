/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if (nums.length === 0) return 0
    
    let pre = 0
    
    for (let i = 0; i < nums.length; i++) {
        if (i !== pre && nums[i] !== nums[pre]) {
            nums[++pre] = nums[i]
        }
    }
    
    return pre + 1
};