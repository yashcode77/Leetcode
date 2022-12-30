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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null){// if given LinkedList has no nodes or single node then return head
            return head;
        }

        ListNode curOdd = head; //Pointer to the Odd Elemets
        ListNode EvenList = head.next; //pointingthe first even element so that we can link odd elemts with even elemets
        ListNode curEven = EvenList; //Pointer to the Even Elements

        while(curOdd.next != null && curEven.next != null ){
            curOdd.next = curEven.next; //currOdd will point to all Odd Elements iteratively
            curOdd = curOdd.next; //moving the curOdd to next Odd Element

            curEven.next = curOdd.next;//currOdd will point to all Right Elements iteratively
            curEven = curEven.next;//moving the curOdd to next Right Element
        }

        curOdd.next = EvenList; //Linking the odd Elements will Even Elements

        return head; //returning the head
        
    }
}