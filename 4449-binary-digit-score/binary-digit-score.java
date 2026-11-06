class Solution {
    public int calculateScore(int a, int b) {
        return Integer.bitCount(a) >=Integer.bitCount(b) ? Integer.bitCount(a) * Integer.bitCount(b) :Integer.bitCount(b) / Integer.bitCount(a);
    }
}