class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        find(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void find(int[] nums, int i, List<Integer> list, List<List<Integer>> ans) {
        if(i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        find(nums,i+1,list,ans);
        list.removeLast();
        find(nums,i+1,list,ans);
    }
}