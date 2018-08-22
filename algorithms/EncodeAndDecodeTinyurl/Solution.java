public class Codec {
    private Map<Integer, String> map = new HashMap<Integer, String>();
    private int index = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(index, longUrl);
        return "http://tinyurl.com/" + String.valueOf(index++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String i = shortUrl.replace("http://tinyurl.com/", "");
        return map.get(Integer.valueOf(i));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));