class Solution(object):
    def rotatedDigits(self, N):
        """
        :type N: int
        :rtype: int
        """
        count = 0
        for num in range(0, N + 1):
            is_good = False
            for n in str(num):
                if n in ['3', '4', '7']:
                    is_good = False
                    break
                if n in ['2', '5', '6', '9']:
                    is_good = True
            if is_good:
                count += 1
        return count