class Solution {
    public int minChanges(String s) {
        int ans = 0;
        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = i + 1;
            int c = 0;
            while (j < s.length() && s.charAt(j) == ch)
                j++;
            c = j - i;
            if (prev != -1 && prev % 2 == 1) {
                c++;
                ans++;
            }
            prev = c;
            i = j - 1;
        }
        return ans;
    }
}