class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int id = 0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(id)==t.charAt(i)){
                if(id==s.length()-1){ return true;}
                id++;
            }
        }

        return false;
    }
}