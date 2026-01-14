class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int[] r = Arrays.copyOf(nums, n);
        int a = 1;
        for(int i=0;i<n;i++){
            if(i==0){
                r[i] = 1;
            } else {
                r[i] = r[i-1]*nums[i-1];
            }
        }
        a = 1;
        for(int i=n-1;i>=0;i--){
            r[i] = r[i]*a;
            a=nums[i]*a;
        }
        return r;
    }
}