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
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode lNode, TreeNode rNode) {
        if (lNode == null && rNode == null) {
            return true;
        }
        if (lNode == null || rNode == null) {
            return false;
        }
        if (lNode.val == rNode.val) {
            return isMirror(lNode.left, rNode.right) && isMirror(lNode.right, rNode.left);
        } else {
            return false;
        }
    }
}
