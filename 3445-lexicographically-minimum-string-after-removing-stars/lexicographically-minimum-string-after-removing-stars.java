class Solution {
    public String clearStars(String s) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '*') pq.poll();
            else pq.offer(new int[] {(int)s.charAt(i), i});
        }
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        while(!pq.isEmpty()) pq1.offer(pq.poll());
        StringBuilder sb = new StringBuilder();
        while(!pq1.isEmpty()) sb.append((char)(pq1.poll()[0]));
        return sb.toString();
    }
}