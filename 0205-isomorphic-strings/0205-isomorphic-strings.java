class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> one = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(one.containsKey(s.charAt(i))){ 
                if(one.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else if (one.containsValue(t.charAt(i))) {
                return false;
            } else {
            one.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}