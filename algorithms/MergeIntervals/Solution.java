/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int intervalsLength = intervals.size();
        if (intervalsLength <= 1) return intervals;
        
        int mid = intervalsLength / 2;
        List<Interval> left = merge(intervals.subList(0, mid)),
                       right = merge(intervals.subList(mid, intervalsLength));
        
        List<Interval> res = new ArrayList<Interval>();
        int i = 0,
            j = 0,
            leftLength = left.size(),
            rightLength = right.size();
        
        while (i < leftLength || j < rightLength) {
            Interval last = res.size() > 0 ? res.remove(res.size() - 1) : null,
                     cur = null;
            
            if (i < leftLength && j < rightLength) {
                if (left.get(i).start < right.get(j).start)
                    cur = left.get(i++);
                else
                    cur = right.get(j++);
            }
            else if (j == rightLength)
                cur = left.get(i++);
            else
                cur = right.get(j++);
            
            if (last != null && isIntersected(last, cur))
                res.add(new Interval(Math.min(last.start, cur.start), Math.max(last.end, cur.end)));
            else {
                if (last != null) res.add(last);
                res.add(cur);
            }
        }
            
        return res;
    }
    
    public boolean isIntersected(Interval i1, Interval i2) {
        return (i1.start <= i2.start && i2.start <= i1.end) ||
               (i1.start <= i2.end && i2.end <= i1.end) ||
               (i2.start <= i1.start && i1.start <= i2.end) ||
               (i2.start <= i1.end && i1.end <= i2.end);
    }
}