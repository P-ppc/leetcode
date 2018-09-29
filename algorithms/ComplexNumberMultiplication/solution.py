class Solution(object):
    def complexNumberMultiply(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        pattern = re.compile(r'(.*)\+(.*)i')
        real1, imaginary1 = pattern.match(a).groups()
        real2, imaginary2 = pattern.match(b).groups()
        
        real = int(real1) * int(real2) - int(imaginary1) * int(imaginary2)
        imaginary = int(real1) * int(imaginary2) + int(real2) * int(imaginary1)
        return '%d+%di' % (real, imaginary)
