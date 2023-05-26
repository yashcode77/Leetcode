/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        int lengthA = 0;
        ListNode ptr2 = headB;
        int lengthB = 0;
        while(ptr1!=null){
            lengthA++;
            ptr1 = ptr1.next;
        }
        while(ptr2!=null){
            lengthB++;
            ptr2 = ptr2.next;
        }
        ptr1 = headA;
        ptr2 = headB;
        if(lengthA > lengthB){
            for(int i=0;i<(lengthA-lengthB);i++){
                ptr1 = ptr1.next;
            }
        }else{
            for(int i=0;i<(lengthB-lengthA);i++){
                ptr2 = ptr2.next;
            }
        }
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2) return ptr1;
            else{
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }
        return null;
    }
}