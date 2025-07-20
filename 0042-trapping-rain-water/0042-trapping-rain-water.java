class Solution {
    public int trap(int[] h) {
        int left =0 , right = h.length-1;
        int ml=0;int mr=0;
        int total=0;
        while(right>left) {
            if(h[right]>h[left]){
                if(h[left]>=ml){
                    ml=h[left];
                    } else {
                        total+=ml-h[left];
                    }
                    left++;
            } else {
                if(h[right]>=mr){
                    mr=h[right];
                    } else {
                        total+=mr-h[right];
                    }
                    right--;
            }
        }
        return total;
    }
}