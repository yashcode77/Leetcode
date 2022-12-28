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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = listLength(head);
        if(len==1) return null;
        if(len==n){
            head=head.next;
            return head;
        }
        ListNode temp = head;
        for(int i=0; i<len-n-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    int listLength(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }
}