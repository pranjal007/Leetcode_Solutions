
// https://leetcode.com/problems/deepest-leaves-sum/

class Solution {
    
    static int maxDepth;
    static int maxSum;
    public int deepestLeavesSum(TreeNode root) {
        
        maxDepth=0;
        maxSum=0;
        calcSum(root, 0);
        return maxSum;
    }
    
    void calcSum(TreeNode node, int currDepth){
        
        if(node==null) return;
        if(currDepth > maxDepth){
            maxSum =0;
            maxDepth=currDepth;
        } 
        if(currDepth == maxDepth){
            maxSum += node.val;
        }
        
        calcSum(node.left, currDepth+1);
        calcSum(node.right, currDepth+1);
    }
}