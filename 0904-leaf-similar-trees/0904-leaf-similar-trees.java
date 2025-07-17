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
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //base case if roots are null
        // if(root1==null && root2==null)
        //     return true;
        List<Integer> node1=new ArrayList<>();
        List<Integer> node2=new ArrayList<>();
        dfs(root1,node1);
        dfs(root2,node2);
        if(node1.size()!=node2.size())   
            return false;
         
         for(int i=0;i<node1.size();i++){
            if(!node1.get(i).equals(node2.get(i))) 
              return false;
        }
        return true;
    }

     void dfs(TreeNode node,List<Integer> ansNode){
       
        if(node==null)
          return ;
          if(node.left==null && node.right==null){
             ansNode.add(node.val);
             return;
          }
        
         dfs(node.left,ansNode);
         dfs(node.right,ansNode);

          
    }

}