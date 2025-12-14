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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){//where slow==fast cycle found
                //now reset the slow ptr and initialize p1 
                ListNode p1=head;
                ListNode p2=slow;
                //move both node 1 step at a time where the value become equal i.e. cycle starts
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}