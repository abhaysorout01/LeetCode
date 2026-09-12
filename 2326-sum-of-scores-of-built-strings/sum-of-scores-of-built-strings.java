class Solution {
    public long sumScores(String s) {
        // Z-Algorithm
        int n = s.length();
        int[] z = new int[n];
        z[0] = n;
        int l = 0;
        int r = 0;
        long ans = n;
        for(int i = 1; i < n; i++) {
            if(i <= r) z[i] = Math.min(z[i - l], r - i + 1);
            while(i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
            if(i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            ans += z[i];
        }
        return ans;
    }
}