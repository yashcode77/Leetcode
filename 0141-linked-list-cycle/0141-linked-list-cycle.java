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
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        if(head!=null){
            slow = head;
            fast = head.next;
            while(fast!=null){
                if(slow==fast)
                    return true;
                else{
                    slow=slow.next;
                    if(fast.next==null){
                        return false;
                    }
                    fast=fast.next.next;
                }
            }
        }    
        return false;
    }
}