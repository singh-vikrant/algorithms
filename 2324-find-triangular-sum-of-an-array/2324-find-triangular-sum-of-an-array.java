class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                nums[j] = (nums[j] + nums[j-1]) % 10;
            }
        }
        return nums[n-1];
    }
}