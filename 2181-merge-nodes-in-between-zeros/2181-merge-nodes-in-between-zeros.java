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
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr1, ptr2;
        ptr1 = ptr2 = head;
        int sum = 0;
        while(ptr2.next!=null){
            if(ptr2.next.val!=0){
                ptr2 = ptr2.next;
                sum += ptr2.val;
            }
            else{
                ptr2.val = sum;
                ptr1.next = ptr2;
                sum = 0;
                ptr1 = ptr2;
                if(ptr2.next.next==null){
                    ptr2.next=null;
                    head = head.next;
                    return head;
                }
                ptr2 = ptr2.next;
            }
        }
        head = head.next;
        return null;
    }
}