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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root ==null){
            return 0;
        }

        TreeNode parent = null;
        return sum(root, parent);
    }

    public int sum(TreeNode curr, TreeNode parent){
        if(curr==null){
            return 0;
        }

        int left = sum(curr.left, curr);
        int right = sum(curr.right, curr);

        int sum =0;
        if(curr.left == null && curr.right == null){
            if(parent!=null && parent.left ==curr){
                sum+= curr.val;
            }


        }

        return sum+ right+ left;
    }
}