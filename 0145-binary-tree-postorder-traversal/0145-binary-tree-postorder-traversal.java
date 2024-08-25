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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(list, root);
        return list;
    }
    
    public  void postOrder(ArrayList<Integer> list, TreeNode root){
        if(root==null){
            return;
        }
        
        postOrder(list, root.left);
        postOrder(list, root.right);
        list.add(root.val);
    }
}