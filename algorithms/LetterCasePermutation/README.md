# Letter Case Permutation
This problem is easy to solve by set, or use Backtracking Algorithm to solve it, just like below:
```
class Solution(object):
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """
        res = []
        self.backtrack('', S, 0, res)
        return res
    
    def backtrack(self, s, S, i, res):
        if i == len(S):
            res.append(s)
            return
        
        if 'A' <= S[i] <= 'z':
            self.backtrack(s + S[i].lower(), S, i + 1, res)
            self.backtrack(s + S[i].upper(), S, i + 1, res)
        else:
            self.backtrack(s + S[i], S, i + 1, res)
```