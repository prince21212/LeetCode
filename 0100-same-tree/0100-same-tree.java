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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base case 
        if(p == null && q == null) // if the both root value is null
        return true;

        if(p == null || q == null) // if anyone root value is null
        return false;

        // main logic
        if(p != null && q != null)
        {
            return (p.val == q .val) && (isSameTree(p.left,q.left)) && (isSameTree(p.right , q.right)); // check for each possible left subtree and right subtree in both the Tree
        }
       
    
           return false;
    }
}