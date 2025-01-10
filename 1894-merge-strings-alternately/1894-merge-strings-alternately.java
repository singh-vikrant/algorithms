class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String s = "";
            for(int i=0; i<(n>m?m:n); i++) {
            s+=word1.charAt(i);
            s+=word2.charAt(i);
            }
        s+= n>m?word1.substring(m,n):word2.substring(n,m);
        return s;
    }
}