let index = 0,
    map = {}
/**
 * Encodes a URL to a shortened URL.
 *
 * @param {string} longUrl
 * @return {string}
 */
var encode = function(longUrl) {
    map[index] = longUrl
    return 'http://tinyurl.com/' + index++
};

/**
 * Decodes a shortened URL to its original URL.
 *
 * @param {string} shortUrl
 * @return {string}
 */
var decode = function(shortUrl) {
    let i = shortUrl.replace('http://tinyurl.com/', '')
    return map[i]
};

/**
 * Your functions will be called as such:
 * decode(encode(url));
 */