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
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }

    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }

        int l = solve(root.left);
        int r = solve(root.right);

        int neeche_hi_ans_milgaya = l + r + root.val;
        int koi_ek_dono_me_se = Math.max(l,r)+root.val;

        int sirf_root_hi_achha_hai = root.val;

        maxSum = Math.max(maxSum, Math.max(neeche_hi_ans_milgaya, Math.max(koi_ek_dono_me_se, sirf_root_hi_achha_hai)));

        return Math.max(koi_ek_dono_me_se,sirf_root_hi_achha_hai);
    }
}