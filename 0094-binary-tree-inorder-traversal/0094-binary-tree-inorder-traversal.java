/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    LinkedList<Integer> ans = new LinkedList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public int inOrder(TreeNode root){
        if(root == null){
            return 0;
        }
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);
        return 1;
    }
}