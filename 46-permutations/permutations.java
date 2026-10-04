class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        per(nums,new int[nums.length],new ArrayList<>(),ans);
        return ans;
    }
    public static void per(int[] arr,int[] map,List<Integer> list,List<List<Integer>> ans) {
        if(list.size() == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j = 0;j < arr.length;j++) {
            if(map[j] == 0) {
                list.add(arr[j]);
                map[j] = 1;
                per(arr,map,list,ans);
                list.removeLast();
                map[j] = 0;
            }
        }
    }
}