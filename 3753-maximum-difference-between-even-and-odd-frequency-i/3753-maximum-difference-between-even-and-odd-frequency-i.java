class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        int e= ((s.length()+1)/2)*2,o=1;
        for(char c: hm.keySet()){
            if(hm.get(c)%2==1 && hm.get(c)>o) o=hm.get(c);
            if(hm.get(c)%2==0 && hm.get(c)<e) e=hm.get(c);
        }
        return o-e;
    }
}