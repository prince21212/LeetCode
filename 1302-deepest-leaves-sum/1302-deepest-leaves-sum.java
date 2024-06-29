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
    int maxLevel, maxSum;
    public int deepestLeavesSum(TreeNode root) {
        maxSum = 0;
        maxLevel = -1;
        deepestLeavesSum(root, 1);
        return maxSum;
    }

    private void deepestLeavesSum(TreeNode root, int level) {
        if(root == null) return;
        if(level > maxLevel) {
            maxLevel = level;
            maxSum = 0;
        }
        if(level == maxLevel && root.left == null && root.right == null) maxSum += root.val; 

        deepestLeavesSum(root.left, level + 1);
        deepestLeavesSum(root.right, level + 1);
    }
}