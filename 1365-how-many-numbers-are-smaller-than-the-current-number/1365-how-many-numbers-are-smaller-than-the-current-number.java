class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] c = nums.clone();
        Arrays.sort(c);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.putIfAbsent(c[i], i);

        }

        for(int i=0;i<nums.length;i++){
            c[i] = hm.get(nums[i]);
            
        }
        return c;
    }
}