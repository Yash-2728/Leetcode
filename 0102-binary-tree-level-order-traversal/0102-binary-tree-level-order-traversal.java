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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ap = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if(root ==null){
            return ap;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            
            if(curr==null){
                ap.add(list2);
                list2 = new ArrayList<>();
               if(q.isEmpty()){
                   break;
               }
                else{
                    q.add(null);
                }
                
            }
            else{
                list2.add(curr.val);
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        
        return ap;
    }
}