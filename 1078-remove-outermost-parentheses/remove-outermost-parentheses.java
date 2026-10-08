class Solution {
    public String removeOuterParentheses(String s) {
        int x = 0;
        int y = 0;
        boolean b = true;
        int st = 0;
        String m = "";
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                x++;
                if(b) {
                    st = i;
                    b = false;
                }
            }
            else {
                x--;
                if(x == 0) {
                    for(int j = st + 1;j < i;j++) {
                        m += s.charAt(j);
                    }
                    b = true;
                }
            }
        }
        return m;
    }
}