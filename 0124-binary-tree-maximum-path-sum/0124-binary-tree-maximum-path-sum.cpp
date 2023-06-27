/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxPathSum(TreeNode* root) {
        int maxi = INT_MIN;
        sum(root, maxi);
        return maxi;
    }
    
    int sum(TreeNode* root,int &maxi){
        if(root==NULL) return 0;
        
        //if a branch is giving -ve ans, simply don't include it (0) as it will only decrease the sum
        int lSum = max(0,sum(root->left, maxi)); 
        int rSum = max(0,sum(root->right, maxi));
        
        maxi = max(maxi, root->val + lSum + rSum);
        
        return root->val + max(lSum,rSum);
    }
};