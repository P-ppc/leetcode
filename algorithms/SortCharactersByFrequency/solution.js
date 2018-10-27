/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {
    let charMap = {}
    s.split('').forEach(c => {
        if (charMap[c] == undefined)
            charMap[c] = 1
        else
            charMap[c]++
    })
    
    let maxHeap = new MaxHeap()
    Object.keys(charMap).forEach(key => {
        maxHeap.push(key, charMap[key])
    })
    
    let res = ''
    while (maxHeap.size() > 0) {
        let key = maxHeap.pop()
        for (let i = 0; i < charMap[key]; i++)
            res += key
    }    
    return res
};

function MaxHeap() {
    this.heap = []
};

MaxHeap.prototype.push = function(item, priority) {
    this.heap.push({item, priority})
    let pos = this.heap.length - 1,
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    
    while (pPos >= 0 && priority > this.heap[pPos].priority) {
        let temp = this.heap[pos]
        this.heap[pos] = this.heap[pPos]
        this.heap[pPos] = temp
        pos = pPos
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    }
};

MaxHeap.prototype.size = function() {
    return this.heap.length
};

MaxHeap.prototype.pop = function() {
    let size = this.size()
    if (size == 0)
        throw new Error('pop form empty list')
    else if (size == 1)
        return this.heap.pop().item
    
    let item = this.heap[0].item,
        pos = 0,
        maxChildPos = pos * 2 + 2
    this.heap[0] = this.heap.pop()
    
    if (maxChildPos < size - 1)
        maxChildPos = this.heap[maxChildPos].priority > this.heap[maxChildPos - 1].priority ? maxChildPos : maxChildPos - 1
    else
        maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    
    while (maxChildPos < size - 1 && this.heap[pos].priority < this.heap[maxChildPos].priority) {
        let temp = this.heap[maxChildPos]
        this.heap[maxChildPos] = this.heap[pos]
        this.heap[pos] = temp
        pos = maxChildPos
        maxChildPos = pos * 2 + 2
        
        if (maxChildPos < size - 1)
            maxChildPos = this.heap[maxChildPos].priority > this.heap[maxChildPos - 1].priority ? maxChildPos : maxChildPos - 1
        else
            maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    }
    
    return item
};