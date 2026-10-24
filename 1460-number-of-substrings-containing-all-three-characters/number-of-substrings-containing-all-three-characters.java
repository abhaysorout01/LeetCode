class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int st = 0;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == 'a') a++;
            else if(s.charAt(i) == 'b') b++;
            else c++;
            while(a > 0 && b > 0 && c > 0) {
                ans += s.length() - i;
                if(s.charAt(st) == 'a') a--;
                else if(s.charAt(st) == 'b') b--;
                else if(s.charAt(st) == 'c') c--;
                st++;
            }
        }
        return ans;
    }
}