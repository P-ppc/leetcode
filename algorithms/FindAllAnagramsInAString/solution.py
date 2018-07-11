class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        res = []
        pattern_length = len(p)
        pattern_map = {}
        for c in p:
            if pattern_map.get(c) == None:
                pattern_map[c] = 0
            pattern_map[c] += 1

        copy_pattern_map = dict(pattern_map)
        beg = 0
        length = 0
        i = 0
        
        while i < len(s):
            if length < pattern_length:
                if copy_pattern_map.get(s[i]) == None:
                    copy_pattern_map = dict(pattern_map)
                    length = 0
                    i += 1
                    beg = i
                elif copy_pattern_map[s[i]] > 0:
                    copy_pattern_map[s[i]] -= 1
                    length += 1
                    i += 1
                else:
                    while s[beg] != s[i]:
                        copy_pattern_map[s[beg]] += 1
                        length -= 1
                        beg += 1
                    # in this place s[beg] == s[i], so we have to go forward 1 distance
                    beg += 1
                    i += 1
            
            if length == pattern_length:
                res.append(beg)
                copy_pattern_map[s[beg]] += 1
                length -= 1
                beg += 1
        
        return res