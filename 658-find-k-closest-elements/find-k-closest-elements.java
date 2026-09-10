class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int n : arr) pq.offer(new int[] {Math.abs(x-n), n});
        for(int i = 0;i < k;i++) list.add(pq.poll()[1]);
        Collections.sort(list);
        return list;
    }
}