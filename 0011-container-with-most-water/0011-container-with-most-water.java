class Solution {
    public int maxArea(int[] height) {
        int left = 0 ; int right = height.length-1;
        int m =0;

        while(right>left) {
            if(height[right]<=height[left]){
                m = Math.max(m, (right-left)*height[right]);
                right--;
            } else if(height[right]>height[left]){
                m = Math.max(m, (right-left)*height[left]);
                left++;
            }
        }

        return m;
    }
}