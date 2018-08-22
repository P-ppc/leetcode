# Encode And Decode Tinyurl
We can solve this problem by hashmap, the better solution is like below:
```python
class Codec:
    def __init__(self):
        self.encode_url_map = {}
        self.url_encode_map = {}
        self.base_url = 'http://tinyurl.com/'
        self.encode_table = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
    
    def encode(self, longUrl):
        """Encodes a URL to a shortened URL.
        
        :type longUrl: str
        :rtype: str
        """
        if self.url_encode_map.get(longUrl):
            return self.base_url + self.url_encode_map.get(longUrl)
        
        # i <= pow(62, 6) - 1
        i = len(self.encode_url_map)
        
        encode = ''
        while i > 0:
            encode += self.encode_table[i % 62]
            i /= 62
        encode = encode.zfill(6)
        self.url_encode_map[longUrl] = encode
        self.encode_url_map[encode] = longUrl
        return self.base_url + encode
        

    def decode(self, shortUrl):
        """Decodes a shortened URL to its original URL.
        
        :type shortUrl: str
        :rtype: str
        """
        encode = shortUrl.replace(self.base_url, '')
        return self.encode_url_map.get(encode)

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))
```