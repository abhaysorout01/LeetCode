class Solution {
    public int minRotations(int n,String s) {
        int original = 0;
        for(int i = 0; i < n; i++) {
            int a = i == 0 ? 0 : s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';
            int diff = Math.abs(a - b);
            original += Math.min(diff, 10 - diff);
        }
        int ans = original;
        for(int k = 0; k < n; k++) {
            int prev = k == 0 ? 0 : s.charAt(k - 1) - '0';
            int first = s.charAt(k) - '0';
            int last = s.charAt(n - 1) - '0';
            int oldDiff = Math.abs(prev - first);
            int newDiff = Math.abs(prev - last);
            int oldCost = Math.min(oldDiff, 10 - oldDiff);
            int newCost = Math.min(newDiff, 10 - newDiff);
            ans = Math.min(ans, original - oldCost + newCost);
        }
        return ans;
    }
}