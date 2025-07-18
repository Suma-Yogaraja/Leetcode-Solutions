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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root){
        List<Integer> visited=new ArrayList<>();
        ans=new ArrayList<String>();
        dfs(root,visited);
        return ans;
    }
    void dfs(TreeNode node,List<Integer> visited){
        if(node==null)
            return;
        visited.add(node.val);
        //check if it is leaf
        if(node.left==null && node.right==null){
                //copy from visited to ans
                ans.add(listString(visited));
                visited.remove(visited.size()-1);
                return;
        }
        dfs(node.left,visited);
        dfs(node.right,visited);
        visited.remove(visited.size()-1);
         return;
    }
    String listString(List<Integer> visited){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<visited.size()-1;i++){
            str.append(visited.get(i)+ "->");
        }
        str.append(visited.get(visited.size()-1));
        return str.toString();
    }
}