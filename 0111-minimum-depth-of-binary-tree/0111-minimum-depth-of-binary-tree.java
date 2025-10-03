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
    int minDepth;
    public int minDepth(TreeNode root) {
        //dfs
        if(root==null)
            return 0;
        minDepth=Integer.MAX_VALUE;
       return dfs(root);
    }
    private int dfs(TreeNode node){
        int currDepth=0;
        if(node==null)
            return 0; 
        int leftDepth=dfs(node.left);
        int rightDepth=dfs(node.right);
        if(node.left==null)
            return rightDepth+1;
        if(node.right==null)
            return leftDepth+1;
        if(node.left==null && node.right==null)
            return currDepth;
        
        currDepth=Math.min(leftDepth,rightDepth)+1;
        return currDepth;
    }
}













//         int depth=0;
//         int mini=0;
//         //use dfs
//         if(root==null)
//             return 0;      
//         //recursive call
//             int left=minDepth(root.left);
//             int right=minDepth(root.right);
//             if(left==0)
//                 return right+1;
//             else if(right==0)
//                 return left+1;
//            return Math.min(left,right)+1;  
//     }
// }