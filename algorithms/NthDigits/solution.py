class Solution(object):
    def findNthDigit(self, n):
        """
        :type n: int
        :rtype: int
        """
        pre_count = 0
        count = 0
        i = 0
        pre_num_count = 0
        
        while count < n:
            if i > 0:
                pre_num_count += 9 * pow(10, i - 1)
            pre_count = count
            count += 9 * pow(10, i) * (i + 1)
            i += 1
        target_num = pre_num_count + ((n - pre_count) / i if (n - pre_count) % i == 0 else (n - pre_count) / i + 1)
        diff = (n - pre_count) % i
        return int(str(target_num)[i - 1 if diff == 0 else diff - 1])