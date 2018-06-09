class Solution(object):
    def largeGroupPositions(self, S):
        """
        :type S: str
        :rtype: List[List[int]]
        """
        last_character = None
        start = 0
        end = 0
        res = []
        
        for i in range(len(S)):
            if last_character == None or last_character == S[i]:
                end = i
            else:
                count = end - start + 1
                if count >= 3:
                    res.append([start, end])
                end = start = i
            last_character = S[i]
        
        if end - start + 1 >= 3:
            res.append([start, end])
        
        return res