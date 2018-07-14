class Solution(object):
    def repeatedStringMatch(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: int
        """
        length_A = len(A)
        length_B = len(B)
        i = j = 0
        nxt = []
        
        # get next array
        while i < length_B:
            if i == 0 or (B[i] != B[j] and j == 0):
                nxt.append(0)
            elif B[i] == B[j]:
                nxt.append(j + 1)
                j += 1
            elif B[i] != B[j] and j > 0:
                j = nxt[j - 1]
                continue
            i += 1
            
        i = j = 0
        while j < length_B:
            if A[i % length_A] == B[j]:
                i += 1
                j += 1
            elif j > 0:
                j = nxt[j - 1]
            elif j == 0:
                i += 1
                
            if i >= length_A + length_B:
                return -1
        
        return i / length_A + 1 if i % length_A > 0 else i / length_A