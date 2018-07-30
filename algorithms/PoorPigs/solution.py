class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        :type buckets: int
        :type minutesToDie: int
        :type minutesToTest: int
        :rtype: int
        """
        base = minutesToTest / minutesToDie + 1
        buckets -= 1
        count = 0
        while buckets > 0:
            buckets /= base
            count += 1
        return count