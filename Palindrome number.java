
// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        char[] a = Integer.valueOf(x).toString().toCharArray();
        int len = a.length;
        for(int i=0;i<len;i++){
            if(i>len-i-1){break;}
            if(a[i]!=a[len-i-1]){return false;}
        }
        return true;
    }
}