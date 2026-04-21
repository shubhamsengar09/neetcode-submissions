class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res  = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), res, used);
        return res;
    }
    public void backtrack(int[] nums, List<Integer>list, List<List<Integer>> res, boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            list.add(nums[i]);
            used[i] = true;
            backtrack(nums, list, res, used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
