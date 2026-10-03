class Solution {
    public static void csum(int[] arr, List<Integer> list,int i,int sum,int target,List<List<Integer>> ans) {
        if(i == arr.length) {
            if(sum == target) ans.add(new ArrayList<>(list));
            return;
        }
        if(sum == target) ans.add(new ArrayList<>(list));
        else if(sum > target) return;
        else {
            list.add(arr[i]);
            sum += arr[i];
            csum(arr,list,i,sum,target,ans);
            list.removeLast();
            sum -= arr[i];
            csum(arr,list,i+1,sum,target,ans);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        csum(candidates,new ArrayList<>(),0,0,target,ans);
        return ans;
    }
}