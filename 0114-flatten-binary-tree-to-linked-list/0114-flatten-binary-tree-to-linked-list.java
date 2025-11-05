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
    List<TreeNode> arr;
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode temp=curr.left;
                while(temp.right!=null)
                    temp=temp.right;
                temp.right=curr.right;
                curr.right=curr.left;
                curr.left=null;

            }
            curr=curr.right;
        }
    }
}






















//         if(root==null)
//             return;
//         arr=new ArrayList<>();
//         preOrder(root);
//         for(int i=1;i<arr.size();i++){
//             root.left=null;
//             root.right=arr.get(i);
//             root=root.right;
//         }
//     }
//     private void preOrder(TreeNode node){
//         if(node==null)
//             return;
//         arr.add(node);
//         preOrder(node.left);
//         preOrder(node.right);
//     }
// }