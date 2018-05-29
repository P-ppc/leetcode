class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        res = []
        resturant_map = {}
        min_index_sum = sys.maxint
        for i in range(0, len(list1)):
            resturant_map[list1[i]] = i
        
        for i in range(0, len(list2)):
            if resturant_map.get(list2[i]) != None:
                index_sum = resturant_map.get(list2[i]) + i
                if index_sum < min_index_sum:
                    res = [list2[i]]
                    min_index_sum = index_sum
                elif index_sum == min_index_sum:
                    res.append(list2[i])
            
        return res