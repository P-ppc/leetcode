/**
 * @param {string[]} words
 * @param {number} k
 * @return {string[]}
 */
var topKFrequent = function(words, k) {
    let frequencyMap = new Map()
    words.forEach(word => {
        if (!frequencyMap.has(word))
            frequencyMap.set(word, 1)
        else
            frequencyMap.set(word, frequencyMap.get(word) + 1)
    })
    
    let maxFrequencyHeap = new MaxFrequencyHeap()
    for (let [word, frequency] of frequencyMap.entries()) 
        maxFrequencyHeap.push(word, frequency)
    
    let res = []
    for (let i = 0; i < k; i++)
        res.push(maxFrequencyHeap.pop())
    return res
};

function MaxFrequencyHeap() {
    this.heap = []
};

MaxFrequencyHeap.prototype.push = function(word, frequency) {
    this.heap.push({word, frequency})
    let pos = this.heap.length - 1,
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    
    while (pPos >= 0 && (frequency > this.heap[pPos].frequency || 
                        (frequency == this.heap[pPos].frequency &&
                         word < this.heap[pPos].word))) {
        let temp = this.heap[pos]
        this.heap[pos] = this.heap[pPos]
        this.heap[pPos] = temp
        pos = pPos
        pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2
    }
};

MaxFrequencyHeap.prototype.size = function() {
    return this.heap.length
};

MaxFrequencyHeap.prototype.pop = function() {
    let size = this.size()
    if (size == 0)
        throw new Error('pop form empty list')
    else if (size == 1)
        return this.heap.pop().word
    
    let word = this.heap[0].word,
        pos = 0,
        maxChildPos = pos * 2 + 2
    this.heap[0] = this.heap.pop()
    
    if (maxChildPos < size - 1) {
        if (this.heap[maxChildPos].frequency < this.heap[maxChildPos - 1].frequency ||
           (this.heap[maxChildPos].frequency == this.heap[maxChildPos - 1].frequency &&
            this.heap[maxChildPos].word > this.heap[maxChildPos - 1].word))
            maxChildPos = maxChildPos - 1
    } else
        maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    
    while (maxChildPos < size - 1 && (this.heap[pos].frequency < this.heap[maxChildPos].frequency ||
                                     (this.heap[pos].frequency == this.heap[maxChildPos].frequency &&
                                      this.heap[pos].word > this.heap[maxChildPos].word))) {
        let temp = this.heap[maxChildPos]
        this.heap[maxChildPos] = this.heap[pos]
        this.heap[pos] = temp
        pos = maxChildPos
        maxChildPos = pos * 2 + 2
        
        if (maxChildPos < size - 1) {
            if (this.heap[maxChildPos].frequency < this.heap[maxChildPos - 1].frequency ||
               (this.heap[maxChildPos].frequency == this.heap[maxChildPos - 1].frequency &&
                this.heap[maxChildPos].word > this.heap[maxChildPos - 1].word))
                maxChildPos = maxChildPos - 1
        } else
            maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos
    }
    
    return word
};