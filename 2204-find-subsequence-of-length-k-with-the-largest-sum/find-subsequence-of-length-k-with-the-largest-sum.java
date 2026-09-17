class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] arr = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int i = 0;i < nums.length;i++) pq.offer(new int[] {i,nums[i]});
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        int x = 0;
        while(x < k) {
            pq1.offer(pq.poll());
            x++;
        }
        for(int i = 0;i < k;i++) arr[i] = pq1.poll()[1];
        return arr;
    }
}