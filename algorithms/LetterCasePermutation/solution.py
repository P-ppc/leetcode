class Solution(object):
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """
        res = set()

        for c in S:
            if len(res) == 0:
                res.add(c.upper())
                res.add(c.lower())
            else:
                temp = set()
                for j in res:
                    temp.add(j + c.upper())
                    temp.add(j + c.lower())
                res = temp
        
        res.add(S)
        return list(res)