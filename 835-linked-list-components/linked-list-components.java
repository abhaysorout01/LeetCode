class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int ans = 0;
        while(head != null) {
            if(set.contains(head.val) &&
               (head.next == null || !set.contains(head.next.val))) {
                ans++;
            }
            head = head.next;
        }
        return ans;
    }
}