class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>  hmap = new HashMap<>();
        for(int num: nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            l.add(new ArrayList<>());
        }
        hmap.forEach((key,value)->{
            l.get(value-1).add(key);
        });
        int[] ret = new int[k];
        System.out.println(l);
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i).size()!=0 && k>0){
                 for(int j=0;j<l.get(i).size();j++){
                     if(k>0){
                         System.out.print(k+" ");
                    ret[k-1]=l.get(i).get(j);
                    k--;} else {break;}
                 }
            } 
            if(k==0)break;
        }
        return ret;
    }
}