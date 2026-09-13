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
    int s=0;
    int getH(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left=0;
        int right=0;
        if(root.left!=null) left=getH(root.left);
        if(root.right!=null) right=getH(root.right);
        return 1+Math.max(left,right);
    }
    void getBfs(TreeNode root, int ht, int curr){
        if(ht==curr) s+=root.val;
        if(root.left!=null) getBfs(root.left,ht,curr+1);
        if(root.right!=null) getBfs(root.right, ht, curr+1);
    }
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        int ht=getH(root);
        getBfs(root,ht,1);
        return s;
    }
}