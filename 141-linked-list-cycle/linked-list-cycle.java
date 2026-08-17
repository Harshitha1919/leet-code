/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tur=head;
        ListNode hire=head;
        while(hire!=null && hire.next!=null){
            tur=tur.next;
            hire=hire.next.next;
            if(hire==tur){
                return true;
            }
        }
        return false;
       
    } 
}