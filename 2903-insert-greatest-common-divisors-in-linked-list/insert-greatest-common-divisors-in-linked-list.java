class Solution {
    private int gcd(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            int g = gcd(cur.val, cur.next.val);
            ListNode node = new ListNode(g);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }
        return head;
    }
}