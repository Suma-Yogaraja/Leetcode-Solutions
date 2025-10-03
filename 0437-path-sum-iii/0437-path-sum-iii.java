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
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        int ans=dfs(root,targetSum,0L);
        int left=pathSum(root.left,targetSum);
        int right=pathSum(root.right,targetSum);
        return ans+left+right;
    }
    public int dfs(TreeNode node,int targetSum,long currVal){
        int ans=0;
        if(node==null)
            return 0;
        currVal+=node.val;
        if(currVal==targetSum)
            ans++;
        ans+=dfs(node.left,targetSum,currVal);
        ans+=dfs(node.right,targetSum,currVal);
        return ans;
    }
}

















    // int ans;
    // public int pathSum(TreeNode root, int targetSum) {
    //      ans=0;
    //      traverse(root,targetSum);
    //      return ans;
    // }
    // private void traverse(TreeNode root, int targetSum){
//          if(root==null)
//             return;
//         dfs(root,targetSum,0L);
//         traverse(root.left,targetSum);
//         traverse(root.right,targetSum);
        
//     }
//     private void dfs(TreeNode root,int target,long curr){
//         if(root==null)
//             return;
//         curr+=root.val;
//         if(curr==target)
//             ans++;
//         dfs(root.left,target,curr);
//         dfs(root.right,target,curr);
 
//     }
// }