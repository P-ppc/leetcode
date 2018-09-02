# Definition for an interval.
# class Interval(object):
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        if len(intervals) <= 1: return intervals
        
        mid = len(intervals) / 2
        left = self.merge(intervals[:mid])
        right = self.merge(intervals[mid:])
        
        res = []
        
        i = j = 0
        length_left = len(left)
        length_right = len(right)
        while i < length_left or j < length_right:
            last_interval = res.pop() if len(res) > 0 else None
            
            cur_interval = None
            if i < length_left and j < length_right:
                if left[i].start < right[j].start:
                    cur_interval = left[i]
                    i += 1
                else:
                    cur_interval = right[j]
                    j += 1
            elif j == length_right:
                cur_interval = left[i]
                i += 1
            else:
                cur_interval = right[j]
                j += 1
            
            if last_interval and self.is_intersected(last_interval, cur_interval):
                res.append(Interval(min(last_interval.start, cur_interval.start), max(last_interval.end, cur_interval.end)))
            elif last_interval:
                res.append(last_interval)
                res.append(cur_interval)
            else:
                res.append(cur_interval)
              
        return res
    
    def is_intersected(self, interval1, interval2):
        """
        judge two interval is intersected
        """
        return interval1.start <= interval2.start <= interval1.end or \
               interval1.start <= interval2.end <= interval1.end or \
               interval2.start <= interval1.start <= interval2.end or \
               interval2.start <= interval1.end <= interval2.end    
    