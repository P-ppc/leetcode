class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        versions1 = [int(v) for v in version1.split('.')]
        versions2 = [int(v) for v in version2.split('.')]
        
        while len(versions1) > 0 and versions1[-1] == 0:
            versions1.pop()
        while len(versions2) > 0 and versions2[-1] == 0:
            versions2.pop()
        
        length1 = len(versions1)
        length2 = len(versions2)
        
        for i in xrange(min(length1, length2)):
            if versions1[i] > versions2[i]:
                return 1
            elif versions1[i] < versions2[i]:
                return -1
        
        if length1 > length2:
            return 1
        elif length1 < length2:
            return -1
        else:
            return 0