class Solution(object):
    def licenseKeyFormatting(self, S, K):
        """
        :type S: str
        :type K: int
        :rtype: str
        """
        S = S.upper()
        res = ''
        
        count = -1
        
        length = len(S)
        for i in range(length):
            if S[length - 1 - i] != '-':
                if count == K - 1:
                    res = S[length - 1 - i] + '-' + res
                    count = 0
                elif count < K - 1:
                    res = S[length - 1 - i] + res
                    count += 1
        return res