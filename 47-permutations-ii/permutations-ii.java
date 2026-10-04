class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        per(ans,nums,0);
        return ans;
    }
    public static void per(List<List<Integer>> ans,int[] arr,int i) {
        if(i == arr.length) {
            List<Integer> list = new ArrayList<>();
            for(int n : arr) list.add(n);
            ans.add(list);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j = i;j < arr.length;j++) {
            if(set.contains(arr[j])) continue;
            set.add(arr[j]);
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            per(ans,arr,i+1);
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}