
// https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        
        
        if(word.toLowerCase().equals(word)) return true;
        else if(word.toUpperCase().equals(word)) return true;
        else if(word.charAt(0)<=90){
            if(word.substring(1,word.length()).toLowerCase().equals(word.substring(1,word.length()))) return true;
        }
    
        return false;
    }
}