class Solution(object):
    def subdomainVisits(self, cpdomains):
        """
        :type cpdomains: List[str]
        :rtype: List[str]
        """
        visited_map = {}
        for cpdomain in cpdomains:
            base_count, domain = cpdomain.split(' ')
            splits = domain.split('.')
            start = len(splits) - 1
            while start >= 0:
                target = '.'.join(splits[start: ])
                if visited_map.get(target) == None:
                    visited_map[target] = int(base_count)
                else:
                    visited_map[target] += int(base_count)
                start -= 1
        return [str(visited_map[x]) + ' ' + x for x in visited_map.keys()]