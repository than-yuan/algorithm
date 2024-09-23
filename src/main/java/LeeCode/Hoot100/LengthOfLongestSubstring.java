package LeeCode.Hoot100;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }
        int result = 0, p = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i) - 0)){
                if (map.get(s.charAt(i) - 0) < p){
                    // do nothing
                } else if (map.get(s.charAt(i) - 0) == p){
                    p = map.get(s.charAt(i) - 0) + 1;
                    map.put(s.charAt(i) - 0, i);
                } else {
                    p = map.get(s.charAt(i) - 0) + 1;
                    map.put(s.charAt(i) - 0, i);
                }
            } else {
                map.put(s.charAt(i) - 0, i);
            }
            result = (i - p + 1) > result ? (i - p + 1) : result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
