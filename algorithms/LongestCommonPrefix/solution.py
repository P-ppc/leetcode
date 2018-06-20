class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix = None
        
        for s in strs:
            if prefix == None:
                prefix = s
            else:
                temp_prefix = ''
                for i in range(min(len(prefix), len(s))):
                    if prefix[i] == s[i]:
                        temp_prefix += prefix[i]
                    else:
                        break
                prefix = temp_prefix
                if prefix == '':
                    break
        
        return prefix if prefix != None else ''