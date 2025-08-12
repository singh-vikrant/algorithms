class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=nums[0]==k?1:0;
        int n = nums.length;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==k) c++; 
            nums[i]+=nums[i-1];
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++) {
                if(j==i){
                    if(nums[j]==k) c++;
                } else {
                        if(nums[j]-nums[j-i-1] == k){
                            c++;
                        }
                    }
            }
        }
        return c;
    }
}