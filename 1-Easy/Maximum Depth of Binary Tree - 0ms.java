
// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    public int maxDepth(TreeNode root) {
    
        if(root==null) return 0;
        
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
}