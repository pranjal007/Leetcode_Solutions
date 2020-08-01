
// https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length()==0) return t.charAt(0);
        
        char c = 0;
        for(int i=0;i<s.length();++i){
            c ^= s.charAt(i);
        }
        for(int i=0;i<t.length();++i){
            c ^= t.charAt(i);
        }
        
        
        return c;
    }
}