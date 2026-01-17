public class Codec {
    HashMap<String, String> map = new HashMap<>();
    int a = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(map.containsKey(longUrl)){
            return map.get(longUrl);
        } else {
            a++;
            map.put(longUrl, a+"");
        }
        return a+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(shortUrl)) {
                return entry.getKey(); 
            }
        }
        return "";
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));