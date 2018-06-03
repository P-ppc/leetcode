class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        index = 0
        
        while index < len(letters):
            if letters[index] > target:
                break
            else:
                index += 1
        
        if index == len(letters):
            index = 0
        return letters[index]