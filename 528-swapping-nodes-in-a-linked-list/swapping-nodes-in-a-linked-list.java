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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        // ✅ Count the total number of nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // ✅ Reset temp back to head
        temp = head;
        int c = 0;
        ListNode start = null;
        ListNode end = null;

        // ✅ Traverse again to find kth node and (count-k+1)th node
        while (temp != null) {
            c++;
            if (c == k) {       // directly kth node
                start = temp;
            }
            if (c == (count - k + 1)) {   // (count-k+1)th node
                end = temp;
            }
            temp = temp.next;
        }

        // ✅ Swap values
        int t = start.val;
        start.val = end.val;
        end.val = t;

        return head;
    }
}
