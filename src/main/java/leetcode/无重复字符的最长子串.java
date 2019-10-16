package leetcode;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(s==null||length<1) return 0;
        int dp[] =new int[length];
        Map<Character,Integer> map =new HashMap<>();
        dp[0]=1;
        int max=1;
        map.put(s.charAt(0), 0);
        for (int i = 1; i < length; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                Integer integer = map.get(c);
                if(i-integer>dp[i-1]){
                    dp[i]=dp[i-1]+1;
                }else {
                    dp[i]=i-integer;
                }
            }else{
                dp[i]=dp[i-1]+1;
            }
            max=Math.max(dp[i],max);
            map.put(c, i);
        }
        return max;
    }
}
