/**
 * Definition for an interval.
 * function Interval(start, end) {
 *     this.start = start;
 *     this.end = end;
 * }
 */
/**
 * @param {Interval[]} intervals
 * @return {Interval[]}
 */
var merge = function(intervals) {
    if (intervals.length <= 1) return intervals
    
    
    let mid = parseInt(intervals.length / 2),
        left = merge(intervals.slice(0, mid)),
        right = merge(intervals.slice(mid, intervals.length)),
        leftLength = left.length,
        rightLength = right.length,
        res = [],
        i = j = 0
    
    while (i < leftLength || j < rightLength) {
        let last = res.length > 0 ? res.pop() : null,
            cur = null
        
        if (i < leftLength && j < rightLength) {
            if (left[i].start < right[j].start) cur = left[i++]
            else cur = right[j++]
        } 
        else if (j == rightLength)
            cur = left[i++]
        else
            cur = right[j++]
        
        if (last && isIntersected(last, cur))
            res.push(new Interval(Math.min(last.start, cur.start), Math.max(last.end, cur.end)))
        else {
            if (last) res.push(last)
            res.push(cur)
        }
    }
    
    return res
};

var isIntersected = function(interval1, interval2) {
    return (interval1.start <= interval2.start && interval2.start <= interval1.end) ||
           (interval1.start <= interval2.end && interval2.end <= interval1.end) ||
           (interval2.start <= interval1.start && interval1.start <= interval2.end) ||
           (interval2.start <= interval1.end && interval1.end <= interval2.end)
}