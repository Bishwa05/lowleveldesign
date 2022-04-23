package tinyurl;

/**
 *
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 * Leetcode : 535. Encode and Decode TinyURL
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec {
    String base = "http://tinyurl.com/";
    String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%0123456789";

    Map<String, String> longToShort = new HashMap<>();
    Map<String, String> shortToLong = new HashMap<>();

    public String encode(String longUrl){

        if(longToShort.containsKey(longUrl)){
            return base + longToShort.get(longUrl);
        }

        String encoded = convert();

        while(shortToLong.containsKey(encoded)){
             encoded = convert();
        }

        longToShort.put(longUrl, encoded);
        shortToLong.put(encoded, longUrl);
        return base + encoded;
    }

    public String decode(String shortUrl){

        String encoded = shortUrl.substring(base.length());
        if(shortToLong.containsKey(encoded)) {
            return shortToLong.get(encoded);
        }
        return "";
    }

    private String convert() {
        String s = "";

        for(int i =0; i<6; i++) {
            s+=code.charAt(new Random().nextInt(67));
        }
        return s;
    }
}
