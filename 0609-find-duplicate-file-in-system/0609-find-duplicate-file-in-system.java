class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ls = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();
        for(String path: paths){
            String[] ss = path.split(" ");
            String p = ss[0]+"/";
            for(int i=1;i<ss.length;i++){
                String val=p+ss[i].split("\\(")[0];
                String key=ss[i].split("\\(")[1];
                List<String> res = hm.getOrDefault(key,new ArrayList<>());
                res.add(val);
                hm.put(key, res);
            }
        }
        for (String key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key).toString());
            if(hm.get(key).size()>1)
            {
                ls.add(hm.get(key));
            }


        }
        return ls;
    }
}