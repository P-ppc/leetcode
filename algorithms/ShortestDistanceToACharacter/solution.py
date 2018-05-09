class Solution(object):
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        res = []
        pos = []
        for i in range(0, len(S)):
            if S[i] == C:
                pos.append(i)
        for i in range(0, len(S)):
            res.append(min([abs(i - p) for p in pos]))
        return res