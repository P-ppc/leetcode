class Solution(object):
    def dailyTemperatures(self, temperatures):
        """
        :type temperatures: List[int]
        :rtype: List[int]
        """
        length = len(temperatures)
        res = [0] * length
        stack = []
        
        for i in xrange(length):
            while len(stack) > 0 and stack[-1]['value'] < temperatures[i]:
                e = stack.pop()
                res[e['index']] = i - e['index']
            stack.append({ 'index': i, 'value': temperatures[i] })
            
        return res