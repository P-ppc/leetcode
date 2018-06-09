class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_map = {}
        t_map = {}
        
        for i in range(len(s)):
            s_c = s[i]
            t_c = t[i]
            if s_map.get(s_c) == None and t_map.get(t_c) == None:
                s_map[s_c] = t_c
                t_map[t_c] = s_c
            elif s_map.get(s_c) != t_c or t_map.get(t_c) != s_c:
                return False
        
        return True