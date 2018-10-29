class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        frequency_map = {}
        for num in nums:
            if not frequency_map.get(num):
                frequency_map[num] = 1
            else:
                frequency_map[num] += 1
        
        heap = []
        for key, value in frequency_map.items():
            heap.append({ 'value': key, 'frequency': value })
            
        return [x['value'] for x in heapq.nlargest(k, heap, lambda e : e['frequency'])]
        
