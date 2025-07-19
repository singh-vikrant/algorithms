class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char[] c1 = s.toCharArray(); Arrays.sort(c1);
        char[] c2 = t.toCharArray(); Arrays.sort(c2);

        for(int i=0;i<s.length();i++){
            if(c1[i]!= c2[i] ) return false;
        }
        return true;
    }
}