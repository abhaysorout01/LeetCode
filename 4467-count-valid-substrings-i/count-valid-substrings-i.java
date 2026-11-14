class Solution {
    public long countValidSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        long ans = 0;
        for(int i = 0;i < s.length();i++) {
            sb.append(s.charAt(i));
            int len = sb.length();
            if (len >= 3 && sb.charAt(len - 3) == 'a' && sb.charAt(len - 2) == 'b' && sb.charAt(len - 1) == 'c') {
                sb.setLength(0);
                sb.append("bc");
            }
            ans += sb.length();
        }
        return ans;
    }
}