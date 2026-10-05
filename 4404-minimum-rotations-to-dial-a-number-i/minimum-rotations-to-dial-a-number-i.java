class Solution {
    public int minRotations(String s) {
        int ans = 0;
        for(int i = 0;i < s.length();i++) {
            if(i == 0) ans += Math.min(Math.abs(s.charAt(i)-'0'),Math.abs(s.charAt(i)-'0'-10));
            else ans += Math.min(Math.abs(s.charAt(i)-s.charAt(i-1)),10 - Math.abs(s.charAt(i)-s.charAt(i-1)));
        }
        return ans;
    }
}