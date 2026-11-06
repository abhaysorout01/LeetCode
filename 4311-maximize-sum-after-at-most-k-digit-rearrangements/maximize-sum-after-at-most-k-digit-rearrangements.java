
class Solution {
    public long maximizeSum(int[] nums, int k) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[1], a[1]));
        long ans = 0;
        for (int n : nums) {
            ans += n;
            int[] digits = new int[10];
            int t = n;
            while (t > 0) {
                digits[t % 10]++;
                t /= 10;
            }
            long rearranged = 0;
            for (int i = 9; i >= 0; i--) {
                while (digits[i] > 0) {
                    rearranged = rearranged * 10 + i;
                    digits[i]--;
                }
            }
            long gain = rearranged - n;
            pq.offer(new long[]{n, gain});
        }
        while (k > 0 && !pq.isEmpty()) {
            long[] arr = pq.poll();
            if (arr[1] <= 0) break;
            ans += arr[1];
            k--;
        }
        return ans;
    }
}