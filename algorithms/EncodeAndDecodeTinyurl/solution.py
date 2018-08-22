class Codec:
    
    def __init__(self):
        self.index = 0
        self.map = {}
    
    def encode(self, longUrl):
        """Encodes a URL to a shortened URL.
        
        :type longUrl: str
        :rtype: str
        """
        self.map[self.index] = longUrl
        temp = self.index
        self.index += 1
        return 'http://tinyurl.com/' + str(temp)

    def decode(self, shortUrl):
        """Decodes a shortened URL to its original URL.
        
        :type shortUrl: str
        :rtype: str
        """
        i = shortUrl.replace('http://tinyurl.com/', '')
        return self.map.get(int(i))

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))