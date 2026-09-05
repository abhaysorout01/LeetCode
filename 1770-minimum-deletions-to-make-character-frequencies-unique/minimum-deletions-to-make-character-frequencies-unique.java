class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()) arr[ch-'a']++;
        boolean[] brr = new boolean[s.length() + 1];
        for(int i = 0;i < 26;i++) {
            if(!brr[arr[i]]) brr[arr[i]] = true;
            else {
                int x = arr[i];
                while(x > 0 && brr[x]) {
                    x--;
                    ans++;
                }
                brr[x] = true;
            }
        }
        return ans;
    }
}