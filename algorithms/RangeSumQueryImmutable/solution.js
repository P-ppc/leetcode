/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.sumMap = {}
    nums.forEach((num, index) => {
        if (index === 0) {
            this.sumMap[index] = num
        } else {
            this.sumMap[index] = this.sumMap[index - 1] + num
        }
    })
};

/** 
 * @param {number} i 
 * @param {number} j
 * @return {number}
 */
NumArray.prototype.sumRange = function(i, j) {
    if (i === 0) {
        return this.sumMap[j]
    } else {
        return this.sumMap[j] - this.sumMap[i - 1]
    }
};

/** 
 * Your NumArray object will be instantiated and called as such:
 * var obj = Object.create(NumArray).createNew(nums)
 * var param_1 = obj.sumRange(i,j)
 */