class Solution(object):
    class MaxHeap(object):
        def __init__(self):
            self.heap = []
            
        def push(self, value):
            self.heap.append(value)
            pos = len(self.heap) - 1
            p_pos = (pos - 2 if pos % 2 == 0 else pos - 1) / 2
            
            while p_pos >= 0 and value > self.heap[p_pos]:
                self.heap[pos], self.heap[p_pos] = self.heap[p_pos], self.heap[pos]
                pos = p_pos
                p_pos = (pos - 2 if pos % 2 == 0 else pos - 1) / 2
            
        
        def size(self):
            return len(self.heap)
        
        def pop(self):
            size = len(self.heap)
            if size == 0:
                raise IndexError('pop from empty list')
            elif size == 1:
                return self.heap.pop()
            
            value = self.heap[0]
            self.heap[0] = self.heap.pop()
            pos = 0
            max_child_pos = pos * 2 + 2
            if max_child_pos < size - 1:
                max_child_pos = max_child_pos if self.heap[max_child_pos] > self.heap[max_child_pos - 1] else max_child_pos - 1
            else:
                max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
            
            while max_child_pos < size - 1 and self.heap[pos] < self.heap[max_child_pos]:
                self.heap[pos], self.heap[max_child_pos] = self.heap[max_child_pos], self.heap[pos]
                pos = max_child_pos
                max_child_pos = pos * 2 + 2
                if max_child_pos < size - 1:
                    max_child_pos = max_child_pos if self.heap[max_child_pos] > self.heap[max_child_pos - 1] else max_child_pos - 1
                else:
                    max_child_pos = max_child_pos - 1 if max_child_pos - 1 < size - 1 else pos
            return value
            
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        max_heap = Solution.MaxHeap()
        for num in nums:
            max_heap.push(num)
            
        for i in xrange(k - 1):
            max_heap.pop()
        
        return max_heap.pop()