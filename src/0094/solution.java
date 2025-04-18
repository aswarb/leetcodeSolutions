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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        traverse(root, l);
        return l;
        
    }
    
    private static void traverse(TreeNode root, List<Integer> l) {
        if (root != null) { 
            traverse(root.left, l);
            l.add(root.val);
            traverse(root.right, l);
        }
    }
}
