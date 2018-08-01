/**
 * @param {number} k
 * @param {number[]} nums
 */
var KthLargest = function(k, nums) {
    let length = nums.length
    this.heap = nums.sort((a, b) => a - b)
    this.heap = this.heap.slice(length >= k ? length - k : 0)
    this.length = k
};

/** 
 * @param {number} val
 * @return {number}
 */
KthLargest.prototype.add = function(val) {
    let heapLength = this.heap.length
    if (heapLength < this.length || this.heap[0] < val) {
        let i = 0,
            length = Math.min(this.length, heapLength)
        while (i < length) {
            if (this.heap[i] >= val) {
                break
            }
            i++
        }
        this.heap.splice(i, 0, val)
        if (heapLength === this.length) this.heap.shift()
    }
    return this.heap[0]
};

/** 
 * Your KthLargest object will be instantiated and called as such:
 * var obj = Object.create(KthLargest).createNew(k, nums)
 * var param_1 = obj.add(val)
 */