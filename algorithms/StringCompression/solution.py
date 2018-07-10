class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        char = None
        count = 0
        length = 0
        
        for c in chars:
            if char == None:
                count = 1
                char = c
            elif char == c:
                count += 1
            elif char != c:
                chars[length] = char
                length += 1
                
                if count > 1:
                    count_str = str(count)
                    for c in count_str:
                        chars[length] = c
                        length += 1
                    
                count = 1
                char = c
            
        chars[length] = char
        length += 1

        if count > 1:
            count_str = str(count)
            for c in count_str:
                chars[length] = c
                length += 1
        
        return length
                
            