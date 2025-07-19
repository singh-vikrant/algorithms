class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n<2) return n;
        Arrays.sort(nums);
        int max=1;
        int c=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                c++;
                max = max>c?max:c;
            } else if(nums[i]==nums[i+1]){
            } else {
                c=1;
            }
        }
        return max;
    }
}