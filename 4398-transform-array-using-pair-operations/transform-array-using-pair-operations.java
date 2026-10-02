class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1 = 0;
        for(int n : source) sum1 += n;
        long sum2 = 0;
        for(int n : target) sum2 += n;
        return sum1 == sum2;
    }
}