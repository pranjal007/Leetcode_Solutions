
// https://leetcode.com/problems/same-tree/

class Solution {
    
    boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
            
            if((p==null && q!=null) || (p!=null && q==null)) flag=false;
        
            else if (p==null && q==null) return true;
            
            else if( p.val!=q.val) flag=false;
            
            if(flag==true) isSameTree(p.left, q.left);
            
            if(flag==true)isSameTree(p.right, q.right);
     
        
        return flag;
        
    }
    
}