class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        g.sort()
        s.sort()
        count = 0
        index = 0
        
        for i in s:
            if i >= g[index]:
                count += 1
                index += 1
                if index == len(g):
                    break
                        
        return count