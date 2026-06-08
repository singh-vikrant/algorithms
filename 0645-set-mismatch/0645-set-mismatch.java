class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] k = new int[2];
        int[] nn = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nn[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(nn[i]==2){
                k[0]=i+1;
            } 
            if(nn[i]==0) {
                k[1]=i+1;
            }
        }
        return k;
    }
}