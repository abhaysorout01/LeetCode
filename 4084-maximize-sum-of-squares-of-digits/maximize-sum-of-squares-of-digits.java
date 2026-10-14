class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(i = num - 1; i >= 0 && sum > 0; i--) {
            sb.append(Integer.toString(Math.min(9, sum)));
            sum -= Math.min(9, sum);
        }
        for(int k = i;k >= 0;k--) sb.append("0");
        if(sum > 0) return "";
        return sb.toString();
    }
}