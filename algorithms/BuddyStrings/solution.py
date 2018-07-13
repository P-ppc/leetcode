class Solution(object):
    def buddyStrings(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: bool
        """
        if len(A) != len(B):
            return False
        
        if A == B:
            # 只要有一个重复的字母即可
            character_map = {}
            for c in A:
                if character_map.get(c) == None:
                    character_map[c] = True
                else:
                    return True
            return False
        else:
            # 只能有2个位置不同，且a1 == b2 and b1 == a2
            diffs = []
            for i in range(len(A)):
                if A[i] != B[i]:
                    diffs.append(A[i])
                    diffs.append(B[i])
            if len(diffs) == 4 and diffs[0] == diffs[3] and diffs[1] == diffs[2]:
                return True
            return False
            
        