class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        generate(nums, list, 0);
        return res;
    }

    void generate(int[] nums, List<Integer> list, int index){
        if(index==nums.length){
            res.add(new ArrayList<>(list));
            return;
        } else{
            list.add(nums[index]);
            generate(nums, list, index+1);
            list.remove(list.size()-1);
            generate(nums, list, index+1);
        }
    }

}