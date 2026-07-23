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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>result=new ArrayList<>();
        String res="";
        dfs(root,res,result);
        return result;
    }
    void dfs(TreeNode root, String res, List<String>result){
        if(root==null) return;
        if(res.length()==0){
            res+=root.val;
        }
        else{
            res+="->"+root.val;

        }
        if(root.left==null && root.right==null){
            result.add(res);
            return;
    }
        dfs(root.left,res,result);
        dfs(root.right,res,result);

}
}