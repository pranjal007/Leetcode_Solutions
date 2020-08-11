
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        
        String x = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] c = x.toCharArray();
        
        for(int i=0;i<c.length/2;i++){
            if(c[i]!=c[c.length-i-1]) return false;
        }
        
        return true;
    }
}