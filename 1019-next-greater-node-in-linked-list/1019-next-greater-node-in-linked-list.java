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
    public int[] nextLargerNodes(ListNode head) {
        int n = size(head);
        int[] ans = new int[n];
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int i = 0;
        while (ptr1 != null) {
            ptr2 = ptr1.next;
            while (ptr2 != null) {
                if (ptr2.val > ptr1.val) {
                    ans[i] = ptr2.val;
                    break;
                }
                ans[i] = 0;
                ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
            i++;
        }
        return ans;
    }
    public int size(ListNode temp) {
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        return n;
    }
}
