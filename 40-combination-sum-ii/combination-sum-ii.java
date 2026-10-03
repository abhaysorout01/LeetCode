class Solution {
    public static int skip(int[] arr, int i) {
        if(i + 1 < arr.length && arr[i] == arr[i + 1]) return skip(arr, i + 1);
        return i + 1;
    }

    public static void comb(int[] arr, int i, int target, List<Integer> list, HashSet<List<Integer>> ans, int sum) {
        if(i == arr.length) {
            if(sum == target) ans.add(new ArrayList<>(list));
            return;
        }

        if(sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if(sum > target) return;

        list.add(arr[i]);
        comb(arr, i + 1, target, list, ans, sum + arr[i]);
        list.removeLast();
        int j = skip(arr, i);
        comb(arr, j, target, list, ans, sum);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> ans = new HashSet<>();
        comb(candidates, 0, target, new ArrayList<>(), ans, 0);
        return new ArrayList<>(ans);
    }
}