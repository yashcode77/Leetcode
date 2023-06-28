/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* ans;
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        int reqVal = target->val;
        search(cloned,reqVal);
        return ans;
    }
    void search(TreeNode* root, int num){
        if(root == NULL) return;
        
        if(root->val == num) ans = root;
        search(root->left, num);
        search(root->right, num);
    }
};