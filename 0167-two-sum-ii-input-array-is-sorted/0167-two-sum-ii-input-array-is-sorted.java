class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left =0; int right=nums.length-1;
        int[] ind = new int[]{-1, -1};
        while(right>left){
            int a = nums[left]; int b= nums[right];
            if(a+b==target){
                ind[0] = left+1;
                ind[1] = right+1;
                break;
            }
            else if(a+b>target) right--;
            else if(a+b<target) left++;
        }
        return ind;

    }
}