class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        bra(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public static void bra(List<String> ans, StringBuilder sb,int open,int close,int n) {
        if(open + close == 2 * n) {
            ans.add(sb.toString());
            return;
        }
            if(open < n) {
                sb.append("(");
                open++;
                bra(ans,sb,open,close,n);
                open--;
                sb.deleteCharAt(sb.length() - 1);
            }
            if(close < open) {
                sb.append(")");
                close++;
                bra(ans,sb,open,close,n);
                close--;
                sb.deleteCharAt(sb.length() - 1);
            }
    }
}