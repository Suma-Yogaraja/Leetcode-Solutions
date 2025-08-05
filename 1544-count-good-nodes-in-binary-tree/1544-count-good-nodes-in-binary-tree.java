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
    int goodNode;
    public int goodNodes(TreeNode root) {
        goodNode=0;
    //List<TreeNode> good=new ArrayList<>();
    int maxValue=Integer.MIN_VALUE;

    if(root==null)
        return 0;
    dfs(root,maxValue);
    return goodNode;
    }
    void dfs(TreeNode node,int maxValue){
        if(node==null)
            return;
        if(node.val>=maxValue){
            maxValue=node.val;
            goodNode++;
            //System.out.println(node.val);
        }
        dfs(node.left,maxValue);
        dfs(node.right,maxValue);

    }
}















//         //we use DFS to traverse the tree
//         return dfs(root,Integer.MIN_VALUE);
//     }
//     //write a function that return the total number of good nodes
//     int dfs(TreeNode node,int max){
        
//         if(node==null)
//             return 0;
//         int left=dfs(node.left,Math.max(max,node.val));
//         int right=dfs(node.right,Math.max(max,node.val));
//         int ans=left+right;
//         if(node.val>=max)
//             ans++;
//         return ans;

//     }
// }