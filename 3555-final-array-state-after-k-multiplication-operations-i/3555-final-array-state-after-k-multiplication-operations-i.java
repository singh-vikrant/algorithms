class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;
        while(k>0){
        int max = nums[0];
        int ind = 0 ; 
            for(int i=0;i<n;i++) {
                if(max>nums[i]) {
                    max = nums[i];
                    ind =i;
                }
            }
            nums[ind] = nums[ind]*m;
            k--;
        }
        return nums;
    }
}