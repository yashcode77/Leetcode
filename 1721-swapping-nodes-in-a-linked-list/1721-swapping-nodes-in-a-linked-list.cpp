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
    ListNode* swapNodes(ListNode* head, int k) {
        if(head==NULL) return NULL;
        ListNode* temp = head;
        ListNode* ptr1 = head;
        ListNode* ptr2 = head;
        int len = 0;
        
        for(int i=1;i<k;i++){
            ptr1 = ptr1->next;
        }
        while(temp!=NULL){
            len++;
            temp = temp->next;
        }
        for(int i=1;i<len-k+1;i++){
            ptr2 = ptr2->next;
        }
        swap(ptr1->val,ptr2->val);
        return head;
    }
};