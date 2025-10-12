class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer,Integer> hmap  = new HashMap<>();

        for(int i =0;i<nums.length;i++) {
            if(hmap.containsKey(nums[i])){
                int j = hmap.get(nums[i]);
                if(i-j<=k) return true;
            }
                hmap.put(nums[i], i);
        }
        return false;
    }
}