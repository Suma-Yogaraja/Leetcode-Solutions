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
    public boolean isEvenOddTree(TreeNode root) {
        int level=0;
        if(root==null)
            return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode prevNode = null; 
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(level%2==0){
                    //even level
                   if(node.val%2==0)
                        return false;
                   if(prevNode!=null && prevNode.val>=node.val)
                        return false;
                    
                }
                else{
                    //odd level
                     if(node.val%2!=0)
                        return false;
                   if(prevNode!=null && prevNode.val<=node.val)
                        return false;
                }
                prevNode=node;
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
           level++;
        }
        return true;
    }
}
