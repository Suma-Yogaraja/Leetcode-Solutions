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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        // TreeNode ans=new TreeNode(roo1.val+root2.val);
        Queue<TreeNode[]> q=new LinkedList<>();
        q.offer(new TreeNode[]{root1,root2});
        while(!q.isEmpty()){
                TreeNode[] curr=q.poll();
                TreeNode node1=curr[0];
                TreeNode node2=curr[1];
                node1.val+=node2.val;
            if(node1.left!=null && node2.left!=null){
                    q.offer(new TreeNode[]{node1.left,node2.left});
            }
            else if(node1.left==null){
                     node1.left=node2.left;
            
               }
    
             if(node1.right!=null && node2.right!=null){
                    q.offer(new TreeNode[]{node1.right,node2.right});
             }    
             else if(node1.right==null){
                      node1.right=node2.right;
                 }
            
        }
        return root1;
    }
}