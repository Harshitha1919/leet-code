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
        ListNode temp=head;
        int count=0;
        ListNode temp2=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int c=0;
        int value=0;
        int ans1=0;
        int ans2=0;
        ListNode start=null;
        ListNode end=null;
        while(temp!=null){
            c++;
            if(c==k){
             start=temp;
             
            }
            if(c==count-k+1){
                
                end=temp;
               

            }
            temp=temp.next;
        }
        int t=start.val;
        start.val=end.val;
        end.val=t;
        return head;
    }
}