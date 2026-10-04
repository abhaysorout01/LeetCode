class Solution {
    public static void comb(List<String> ans,StringBuilder sb,int i,String digits,char[][] chars) {
        if(i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
            for(int j = 0;j < chars[digits.charAt(i)-'0'-2].length;j++) {
                sb.append(chars[digits.charAt(i) - '0' - 2][j]);
                comb(ans,sb,i+1,digits,chars);
                sb.deleteCharAt(sb.length() - 1);
            }
    }
    public List<String> letterCombinations(String digits) {
        char[][] chars = {{'a','b','c'}, {'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        List<String> ans = new ArrayList<>();
        comb(ans,new StringBuilder(),0,digits,chars);
        return ans;
    }
}