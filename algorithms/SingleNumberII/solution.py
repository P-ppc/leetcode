class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        bit_map = [0] * 32
        res = 0

        for i in range(32):
            for num in nums:
                bit_map[i] += num >> i & 1
            res |= bit_map[i] % 3 << i
            # handle the negative in python
            if i == 31 and bit_map[i] % 3 == 1:
                res -= 0xFFFFFFFF + 1
        return res