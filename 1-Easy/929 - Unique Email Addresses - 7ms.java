
// https://leetcode.com/problems/unique-email-addresses/

class Solution {
    public int numUniqueEmails(String[] emails){
        
        Set<String> set = new HashSet<String>();
        StringBuilder str = new StringBuilder("");
        
        for(int i=0;i<emails.length;++i){
            
            str.setLength(0);
            char[] temp = emails[i].toCharArray();
            int flag=0;
            
            for(int j=0;j<temp.length;++j){
                
                if(temp[j] == '@') break;
                else if(temp[j] == '.' && flag==0) temp[j] = Character.MIN_VALUE;
                else if(temp[j] == '+' || flag==1) {
                    flag=1;
                    temp[j]=Character.MIN_VALUE;
                } 
            }
            
            for(int j=0;j<temp.length;++j){
                if(temp[j]!= Character.MIN_VALUE) str.append(temp[j]);   
            }
            
            set.add(str.toString());
        }
        
        return set.size();
    }
}