class Solution(object):
    def findPoisonedDuration(self, timeSeries, duration):
        """
        :type timeSeries: List[int]
        :type duration: int
        :rtype: int
        """
        res = 0
        
        lastTimeSerie = None
        for timeSerie in timeSeries:
            if lastTimeSerie != None:
                res += min(timeSerie - lastTimeSerie, duration)
            lastTimeSerie = timeSerie
        res += duration if lastTimeSerie else 0
        return res
        