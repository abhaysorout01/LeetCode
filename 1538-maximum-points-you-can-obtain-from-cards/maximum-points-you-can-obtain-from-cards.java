class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        long tsum = 0;
        for(int i = 0;i < cardPoints.length;i++) {
            sum += cardPoints[i];
            if(i >= cardPoints.length - k) sum -= cardPoints[i - cardPoints.length + k];
            if(i >= cardPoints.length - k - 1) min = Math.min(min,sum);
            tsum += cardPoints[i];
        }
        return (int) (tsum - min);
    }
}