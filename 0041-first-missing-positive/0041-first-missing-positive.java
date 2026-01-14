class Solution {
    public int firstMissingPositive(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<1){continue;}
            if(nums[i]>num+1){
                return num+1;
            } else{
                num=nums[i];
            }
        }
        return num+1;
    }
}