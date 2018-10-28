/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function(nums, k) {
    let maxHeap = new MaxHeap()
    nums.forEach(num => maxHeap.push(num))
    for (let i = 0; i < k - 1; i++)
        maxHeap.pop()
    return maxHeap.pop()
};

function MaxHeap() {
    this.heap = []
};

MaxHeap.prototype.push = function(value) {
    this.heap.push(value)
    let pos = this.heap.length - 1,
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    
    while (pPos >= 0 && value > this.heap[pPos]) {
        let temp = this.heap[pPos]
        this.heap[pPos] = value
        this.heap[pos] = temp
        pos = pPos
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    }
};

MaxHeap.prototype.size = function() {
    return this.heap.length
};

MaxHeap.prototype.pop = function() {
    let size = this.heap.length
    if (size == 0)
        throw new Error('pop form empty list')
    else if (size == 1)
        return this.heap.pop()
    
    let value = this.heap[0],
        pos = 0,
        maxChildPos = pos * 2 + 2
    this.heap[0] = this.heap.pop()
    
    if (maxChildPos < size - 1)
        maxChildPos = this.heap[maxChildPos] > this.heap[maxChildPos - 1] ? maxChildPos : maxChildPos - 1
    else
        maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    
    while (maxChildPos < size - 1 && this.heap[pos] < this.heap[maxChildPos]) {
        let temp = this.heap[maxChildPos]
        this.heap[maxChildPos] = this.heap[pos]
        this.heap[pos] = temp
        pos = maxChildPos
        maxChildPos = pos * 2 + 2
        
        if (maxChildPos < size - 1)
            maxChildPos = this.heap[maxChildPos] > this.heap[maxChildPos - 1] ? maxChildPos : maxChildPos - 1
        else
            maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    }
    
    return value
};