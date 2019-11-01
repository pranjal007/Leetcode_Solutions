
// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {

        if(s==null || s.length()==0) return -1;
        
        int min = Integer.MAX_VALUE;
        
        for(int i='a';i<='z';i++){
            int pos = s.indexOf(i);
            int lastpos = s.lastIndexOf(i);
            
            if(pos!=-1 && pos==lastpos){
                min = Math.min(min,pos);
            }
        }
        return min == Integer.MAX_VALUE? -1: min;
    }
}