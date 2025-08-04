/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();//map with node as key and parent as value;
        dfs(root,null,parent);//created map and initialised  parents of a particular node
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int currLevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(currLevel==k)
                break;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                //traverse left
                if(curr.left!=null & !visited.contains(curr.left)){
                    visited.add(curr.left);
                    q.offer(curr.left);
                }
                //traverse rght
                if(curr.right!=null && !visited.contains(curr.right)){
                    visited.add(curr.right);
                    q.offer(curr.right);
                }
                //traverse parent
                if(parent.get(curr)!=null && !visited.contains(parent.get(curr))){
                    visited.add(parent.get(curr));
                    q.offer(parent.get(curr));
                }
               
            }
             currLevel++;
        }
        List<Integer> result=new ArrayList<>();
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }

        return result;
    }
    void dfs(TreeNode node,TreeNode par,Map<TreeNode,TreeNode> parent){
        if(node==null)
            return;
        parent.put(node,par);
        dfs(node.left,node,parent);
        dfs(node.right,node,parent);
    }
}