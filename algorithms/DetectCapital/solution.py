class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        upper_count = 0
        lower_count = 0
        for c in word:
            if 65 <= ord(c) <= 90:
                if lower_count > 0:
                    return False
                upper_count += 1
            else:
                if upper_count > 1:
                    return False
                lower_count += 1
        return True