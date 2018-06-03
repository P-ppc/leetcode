class Solution(object):
    def isOneBitCharacter(self, bits):
        """
        :type bits: List[int]
        :rtype: bool
        """
        index = 0
        while index < len(bits):
            if bits[index] == 1:
                if index + 2 == len(bits):
                    return False
                else:
                    index += 2
            else:
                index += 1
        
        return True