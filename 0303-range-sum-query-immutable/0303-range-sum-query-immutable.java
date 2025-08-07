class NumArray {
    int[] n;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            System.out.print(nums[i]+" ");
        }
        this.n = nums;
    }
    
    public int sumRange(int left, int right) {
        return left==0?n[right]:n[right]-n[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */