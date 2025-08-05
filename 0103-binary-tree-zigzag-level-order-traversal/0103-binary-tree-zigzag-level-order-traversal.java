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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //bfs
        if(root==null)
            return new ArrayList<>();// List<List<Integer>>
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean dir=true;//true is considered as left to right dir
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> innerList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                innerList.add(node.val);
                    if(node.left!=null)
                        q.offer(node.left);
                    if(node.right!=null)
                        q.offer(node.right);     
            }
            if(dir)
                res.add(innerList);
            else{
                Collections.reverse(innerList);
                res.add(innerList);
            }
            dir=!dir;
        }
    return res;
    }
}












//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> innerList = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<TreeNode>();
//         boolean dir = true;
//         int depth = 0;//depth even,from right else from left
//         if (root == null)
//             return ans;
//         q.add(root);
//         while (!q.isEmpty()) {
//             int size = q.size();
//             innerList = new ArrayList<>();
//             for (int i = 0; i < size; i++) {
//                 TreeNode node = q.remove();
//                 innerList.add(node.val);
//                 if (node.left != null)
//                     q.add(node.left);
//                 if (node.right != null)
//                     q.add(node.right);
//             }
//             if (dir)
//                 ans.add(innerList);
//             else {
//                 Collections.reverse(innerList);
//                 ans.add(innerList);
//             }
//             dir = !dir;
//         }
//         return ans;
//     }
// }