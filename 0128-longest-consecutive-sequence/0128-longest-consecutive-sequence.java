class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num); 
        }
        int max=0;
        for(int num: hs){
                int currMax = 1; 
                int a = num;
            if(!hs.contains(num-1)){
                while(hs.contains(a+1)){
                    currMax++;
                    a++;
                }
                
            }
            max=max<currMax?currMax:max;
        }
        return max;
    }

}