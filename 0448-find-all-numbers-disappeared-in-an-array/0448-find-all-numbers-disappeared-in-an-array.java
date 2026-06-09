class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] n = new int[nums.length];
        for(int nn : nums){
            n[nn-1] += 1;
        }
        List<Integer> k = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(n[i-1]==0){
                k.add(i);
            }
        }
        return k;
    }
}