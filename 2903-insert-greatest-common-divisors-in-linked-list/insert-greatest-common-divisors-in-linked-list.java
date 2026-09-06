/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode ref = dummy;
        while(head.next != null) {
            ref.next = new ListNode(head.val);
            int a = head.val;
            ref = ref.next;
            int b = head.next.val;
            ref.next = new ListNode(gcd(a,b));
            ref = ref.next;
            head = head.next;
        }
        ref.next = new ListNode(head.val);
        return dummy.next;
    }
}