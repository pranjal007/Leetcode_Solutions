
// https://leetcode.com/problems/reverse-string/

class Solution {
    public String reverseString(String s) {

    char [] chars = s.toCharArray();
        for (int low = 0,height = chars.length - 1;low <= height;low++,height--) {
            char tmp = chars[low];
            chars[low] = chars[height];
            chars[height] = tmp;
        }
        return new String(chars);
    }
}