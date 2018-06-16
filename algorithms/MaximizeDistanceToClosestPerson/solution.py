class Solution(object):
    def maxDistToClosest(self, seats):
        """
        :type seats: List[int]
        :rtype: int
        """
        start = 0
        end = 0
        length = len(seats)
        max_distance = 0
        
        for i in range(len(seats)):
            seat = seats[i]
            if seat == 1:
                if start == 0 or end == length - 1:
                    max_distance = max(max_distance, end - start + 1)
                else:
                    max_distance = max(max_distance, (end - start + 1) / 2 + (end - start + 1) % 2)
                if i + 1 < length:
                    start = end = i + 1
            else:
                end = i
        
        if start == 0 or end == length - 1:
            max_distance = max(max_distance, end - start + 1)
        else:
            max_distance = max(max_distance, (end - start + 1) / 2 + (end - start + 1) % 2)
        
        return max_distance