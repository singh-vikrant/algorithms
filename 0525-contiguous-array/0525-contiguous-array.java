class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        Map<Integer,Integer> hm = new HashMap<>();
        a[0] = nums[0]==0?-1:1;
        hm.put(0,-1);
        hm.put(a[0],0);
        int ml = 0;
        for(int i=1;i<n;i++){
            int t = nums[i]==0?-1:1;
            a[i]=a[i-1]+t;
            if(hm.containsKey(a[i])){
                ml = Math.max(ml, i-hm.get(a[i]));
            } else {
                hm.put(a[i], i);
                
            }
        }
        return ml;
    }
}