class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ga = 0;
        int sa = 0;
        int ans = 0;
        while(ga < g.length && sa < s.length) {
            if(s[sa] >= g[ga]) {
                ga++;
                ans++;
            }
            sa++;
        }
        return ans;
    }
}