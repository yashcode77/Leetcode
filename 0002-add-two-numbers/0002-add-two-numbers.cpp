/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ans = new ListNode();
        int sum = 0, carry = 0, digit;
        ListNode* ptr1 = l1;
        ListNode* ptr2 = l2;
        int factor = 1;
        while(ptr1!=NULL && ptr2!=NULL){
            sum = ptr1->val + ptr2->val + carry;
            carry = 0;
            if(sum < 10) 
                digit = sum;
            else{
                digit = sum%10;
                carry = 1;
            }
            insertAtEnd(ans,digit);
            ptr1 = ptr1->next;
            ptr2 = ptr2->next;
        }
        if(ptr1==NULL){
            while(ptr2!=NULL){
                sum = ptr2->val + carry;
                carry = 0;
            if(sum < 10) 
                digit = sum;
            else{
                digit = sum%10;
                carry = 1;
            }
            insertAtEnd(ans,digit);
                
                ptr2 = ptr2->next;
            }
        }
        else{
            while(ptr1!=NULL){
                sum = ptr1->val + carry;
                carry = 0;
            if(sum < 10) 
                digit = sum;
            else{
                digit = sum%10;
                carry = 1;
            }
            insertAtEnd(ans,digit);
                ptr1 = ptr1->next;
            }
        }
        if(carry) insertAtEnd(ans,carry);
        return ans->next;
    }
    void insertAtEnd(ListNode* &head,int rem){
        ListNode* new_node = new ListNode(rem);
        ListNode* temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = new_node;
    }
};