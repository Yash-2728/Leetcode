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
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return ans;
    }
    
    private boolean ans = true;
    
    public int maxDepth(TreeNode root){
        if(root==null || !ans){
            return 0;
        }
        
        int left  = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left-right)>1){
            ans = false;
        }
        
        return Math.max(left,right)+1;
    }
}