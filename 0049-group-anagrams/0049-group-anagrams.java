class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s: strs){
            String ss = getSortedChars(s);
            List<String> ll = hm.getOrDefault(ss, new ArrayList<>());
            ll.add(s);
            hm.put(ss, ll);
        }
        return new ArrayList<>(hm.values());
    }

    String getSortedChars(String a) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}