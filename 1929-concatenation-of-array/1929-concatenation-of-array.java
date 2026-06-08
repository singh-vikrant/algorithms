class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] k = new int[2*n];
        for(int i=0;i<n;i++){
            k[i] = k[i+n] = nums[i];
        }
        return k;
    }
}