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
    int pairSum(ListNode* head) {
        unordered_map<int,int> mp;
        ListNode* temp = head;
        ListNode* ptr1 = head;
        ListNode* ptr2 = head;
        int halfLength = 0;
        while(ptr2!=NULL && ptr2->next!=NULL){
            ptr1 = ptr1->next;
            ptr2 = ptr2->next->next;
            halfLength++;
        }
        int length = halfLength*2;
        for(int i=0; i<halfLength; i++){
            mp[i] += temp->val;
            temp = temp->next;
        }
        int i=halfLength;
        while(temp!=NULL){
            mp[length-i-1] += temp->val;
            temp = temp->next;
            i++;
        }
        int max = INT_MIN;
        for(auto i : mp){
            if(i.second > max) max = i.second;
        }
        return max;
    }
};