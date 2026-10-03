class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        sub(nums,new ArrayList<>(),ans,0);
        return ans;
    }
    public static void sub(int[] arr,List<Integer> list,List<List<Integer>> ans,int i) {
        ans.add(new ArrayList<>(list));
        for(int j = i;j < arr.length;j++) {
            if(i != j && arr[j] == arr[j-1]) continue;
            list.add(arr[j]);
            sub(arr,list,ans,j+1);
            list.removeLast();
        }
    }
}