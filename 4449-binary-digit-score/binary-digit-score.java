class Solution {
    public int calculateScore(int a, int b) {
        int c1 = 0;
        int c2 = 0;
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        for(char ch : s1.toCharArray()) if(ch == '1') c1++;
        for(char ch : s2.toCharArray()) if(ch == '1') c2++;
        return c1 >= c2 ? c1 * c2 : c2 / c1;
    }
}