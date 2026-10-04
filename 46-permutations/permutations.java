class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        per(nums,0,ans);
        return ans;
    }
    public static void per(int[] arr,int i,List<List<Integer>> ans) {
        if(i == arr.length) {
            List<Integer> list = new ArrayList<>();
            for(int x : arr) list.add(x);
            ans.add(list);
            return;
        }
        for(int j = i;j < arr.length;j++) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            per(arr,i+1,ans);
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}