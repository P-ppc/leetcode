class Solution(object):
    class MaxFrequencyHeap(object):
        def __init__(self):
            self.heap = []
            
        def push(self, word, frequency):
            self.heap.append({ 'word': word, 'frequency':  frequency})
            pos = self.size() - 1
            p_pos = (pos - 2 if pos % 2 == 0 else pos - 1) / 2
            
            while p_pos >= 0 and (frequency > self.heap[p_pos]['frequency'] or \
                                  (frequency == self.heap[p_pos]['frequency'] and word < self.heap[p_pos]['word'])):
                self.heap[pos], self.heap[p_pos] = self.heap[p_pos], self.heap[pos]
                pos = p_pos
                p_pos = (pos - 2 if pos % 2 == 0 else pos - 1) / 2
        
        def size(self):
            return len(self.heap)
        
        def pop(self):
            size = self.size()
            if size == 0:
                raise IndexError('pop form empty list')
            elif size == 1:
                return self.heap.pop()['word']
            
            word = self.heap[0]['word']
            self.heap[0] = self.heap.pop()            
            pos = 0
            max_child_pos = pos * 2 + 2
            if max_child_pos < size - 1:
                if self.heap[max_child_pos]['frequency'] < self.heap[max_child_pos - 1]['frequency'] \
                or (self.heap[max_child_pos]['frequency'] == self.heap[max_child_pos - 1]['frequency'] and \
                   self.heap[max_child_pos]['word'] > self.heap[max_child_pos - 1]['word']):
                    max_child_pos = max_child_pos - 1
            else:
                max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
                
            while max_child_pos < size - 1 and (self.heap[pos]['frequency'] < self.heap[max_child_pos]['frequency'] or \
                                                (self.heap[pos]['frequency'] == self.heap[max_child_pos]['frequency'] and \
                                                self.heap[pos]['word'] > self.heap[max_child_pos]['word'])):
                self.heap[pos], self.heap[max_child_pos] = self.heap[max_child_pos], self.heap[pos]
                pos = max_child_pos
                max_child_pos = pos * 2 + 2
                if max_child_pos < size - 1:
                    if self.heap[max_child_pos]['frequency'] < self.heap[max_child_pos - 1]['frequency'] \
                    or (self.heap[max_child_pos]['frequency'] == self.heap[max_child_pos - 1]['frequency'] and \
                       self.heap[max_child_pos]['word'] > self.heap[max_child_pos - 1]['word']):
                        max_child_pos = max_child_pos - 1
                else:
                    max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
                
            return word
        
    def topKFrequent(self, words, k):
        """
        :type words: List[str]
        :type k: int
        :rtype: List[str]
        """
        frequency_map = {}
        for word in words:
            if not frequency_map.get(word):
                frequency_map[word] = 1
            else:
                frequency_map[word] += 1
                
        max_frequency_heap = self.MaxFrequencyHeap()
        for word, frequency in frequency_map.items():
            max_frequency_heap.push(word, frequency)
        
        res = []
        for i in xrange(k):
            res.append(max_frequency_heap.pop())
        return res