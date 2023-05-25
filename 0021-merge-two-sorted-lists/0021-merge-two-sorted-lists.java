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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1); // Create a dummy head node
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode curr = newHead; // Current pointer to build the merged list

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                curr.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                curr.next = ptr2;
                ptr2 = ptr2.next;
            }
            curr = curr.next;
        }

        // Attach the remaining nodes of list1 or list2
        if (ptr1 != null) {
            curr.next = ptr1;
        } else {
            curr.next = ptr2;
        }

        return newHead.next; // Return the actual merged list
    }
}
