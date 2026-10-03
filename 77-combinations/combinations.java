class Solution {
    public List<List<Integer>> combine(int n, int k) {
        HashSet<List<Integer>> ans = new HashSet<>();
        comb(n,k,new TreeSet<>(),ans);
        return new ArrayList<>(ans);
    }
    public static void comb(int n,int k,TreeSet<Integer> set,HashSet<List<Integer>> ans) {
        if(n == 0) return;
        set.add(n);
        if(set.size() == k) ans.add(new ArrayList<>(set));
        else comb(n-1,k,set,ans);
        set.remove(n);
        comb(n-1,k,set,ans);
    }
}