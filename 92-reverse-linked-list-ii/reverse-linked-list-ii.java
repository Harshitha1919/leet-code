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
    public ListNode reverseBetween(ListNode head, int left, int right) {

         if (head == null || left == right) {
            return head;
        }

        int count1=1;
        ListNode temp=head;
         if (left > 1) {
            while (count1 < left - 1) {
                temp = temp.next;
                count1++;
            }
        }

        ListNode start = (left == 1) ? head : temp.next;
        ListNode head2 = start;
     
        int count2=left;
        ListNode prev=null;
        while( count2<=right){
           ListNode next=start.next;
            start.next=prev;
            prev=start;
            start=next;
            count2++;
        }
         if (left == 1) {
            head2.next = start;
            return prev;
        }

        temp.next=prev;
        head2.next=start;
        

        return head;


    }
}