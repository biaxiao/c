package leetcode;

class 最长回文子串 {
    public String longestPalindrome(String s) {
        int start=0;
        int maxLen=0;
        for (int i = 0; i <s.length() ; i++) {
            int s1 = getSubStringLong(s, i, i);
            int s2 = getSubStringLong(s, i, i + 1);
            int len=Math.max(s1, s2);
            if(len>maxLen){
                start=i-(len-1)/2;
                maxLen=len;
            }

        }
        return s.substring(start,start+maxLen);
    }

    public int getSubStringLong(String s, int l,int r){
        while(l>=0&&r<s.length()&& s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    /*public String longestPalindrome(String s) {
        String res ="";
        for (int i = 0; i <s.length() ; i++) {
            String s1 = getSubString(s, i, i);
            String s2 = getSubString(s, i, i + 1);
            res=res.length()>s1.length()?res:s1;
            res=res.length()>s2.length()?res:s2;
        }
        return res;
    }
    
    public String getSubString(String s, int l,int r){
        while(l>=0&&r<s.length()&& s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }*/
}