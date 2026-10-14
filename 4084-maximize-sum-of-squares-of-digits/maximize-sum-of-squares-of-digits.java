class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int[] digits = new int[num];
        
        for(int i = num - 1; i >= 0; i--) {
            int d = Math.min(9, sum);
            digits[i] = d;
            sum -= d;
        }
        
        if(sum > 0) return "";
        StringBuilder sb = new StringBuilder();
        for(int d : digits) {
            sb.append(d);
        }
        sb.reverse();
        return sb.toString();
    }
}