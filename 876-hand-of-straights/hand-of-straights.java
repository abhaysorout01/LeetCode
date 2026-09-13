class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Arrays.sort(hand);
        boolean[] used = new boolean[hand.length];
        for (int i = 0; i < hand.length; i++) {
            if (used[i]) continue;
            int currentCard = hand[i];
            int count = 0;
            for (int j = i; j < hand.length && count < groupSize; j++) {
                if (!used[j] && hand[j] == currentCard) {
                    used[j] = true;
                    currentCard++; 
                    count++;
                }
            }
            if (count < groupSize) return false;
        }
        return true;
    }
}