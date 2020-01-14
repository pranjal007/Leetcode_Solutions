
// https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
            
        List<List<Integer>> original = new LinkedList<List<Integer>>();
        
        if(root==null) return original;
        
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        TreeNode y = new TreeNode(Integer.MIN_VALUE);
        
        temp.add(root);
        temp.add(y);
        TreeNode curr = null;
            
        while(temp.peek().val!=Integer.MIN_VALUE){
            
            List<Integer> sublist = new LinkedList<Integer>();
            curr = temp.poll();
            
            while(curr.val!=Integer.MIN_VALUE){
                
                if(curr.left!=null)  temp.add(curr.left);
                
                if(curr.right!=null) temp.add(curr.right);
                
                sublist.add(curr.val);
                curr = temp.poll();
            }
           
            temp.add(y);
            original.add(sublist);
            
        }
        
        return original;
    }
}