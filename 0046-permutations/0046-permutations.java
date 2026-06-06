class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int i = 0;
        List<Integer> l1 = new ArrayList<>();
        generate(nums, l1);
        return l;
    }

    void generate(int[] nums, List<Integer> tempList){
        if(tempList.size() == nums.length){
      l.add(new ArrayList<>(tempList));
   } else{
      for(int i = 0; i < nums.length; i++){ 
         if(tempList.contains(nums[i])) continue;
         tempList.add(nums[i]);
         generate(nums, tempList);
         tempList.remove(tempList.size() - 1);
      }
   }
    }
}