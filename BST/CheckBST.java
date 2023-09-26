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
    
    public boolean tellme(TreeNode root,long min ,long max){
        if(root==null){
            return true;
        }
        
        if(root.val>=max || root.val<=min){
            return false;
        }
        
        return tellme(root.left,min,root.val) && tellme(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return tellme(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}