class Solution(object):
    def distributeCandies(self, candies):
        """
        :type candies: List[int]
        :rtype: int
        """
        candy_kinds = set(candies)
        if len(candy_kinds) > len(candies) / 2:
            return len(candies) / 2
        else:
            return len(candy_kinds)