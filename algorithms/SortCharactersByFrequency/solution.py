class Solution(object):
    class MaxHeap(object):
        '''
        simple max heap for this solution 
        '''
        def __init__(self):
            self.heap = []
            
        def push(self, item, priority):
            self.heap.append({ 'item': item, 'priority': priority })
            pos = self.size() - 1
            p_pos = (pos - 2 if pos % 2 == 0 else pos - 1) / 2
            
            while p_pos >= 0 and priority > self.heap[p_pos]['priority']:
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
                return self.heap.pop()['item']
            
            item = self.heap[0]['item']
            self.heap[0] = self.heap.pop()            
            pos = 0
            max_child_pos = pos * 2 + 2
            if max_child_pos < size - 1:
                max_child_pos = max_child_pos if self.heap[max_child_pos]['priority'] > self.heap[max_child_pos - 1]['priority'] else max_child_pos - 1
            else:
                max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
                
            while max_child_pos < size - 1 and self.heap[pos]['priority'] < self.heap[max_child_pos]['priority']:
                self.heap[pos], self.heap[max_child_pos] = self.heap[max_child_pos], self.heap[pos]
                pos = max_child_pos
                max_child_pos = pos * 2 + 2
                if max_child_pos < size - 1:
                    max_child_pos = max_child_pos if self.heap[max_child_pos]['priority'] > self.heap[max_child_pos - 1]['priority'] else max_child_pos - 1
                else:
                    max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
                
            return item
        
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        char_map = {}
        for c in s:
            if not char_map.get(c):
                char_map[c] = 1
            else:
                char_map[c] += 1
        
        max_heap = Solution.MaxHeap()
        for key, value in char_map.items():
            max_heap.push(key, value)
        
        res = ''
        while max_heap.size() > 0:
            c = max_heap.pop()
            res += char_map[c] * c
        return res        
