class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] != b[1] ? Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));
        for(int i = 0;i < mat.length;i++) {
            int sum = 0;
            for(int j = 0;j < mat[0].length;j++) sum += mat[i][j];
            pq.offer(new int[] {i,sum});
        }
        int[] arr = new int[k];
        int i = 0;
        while(i < k) {
            int[] temp = pq.poll();
            arr[i++] = temp[0];
        }
        return arr;
    }
}