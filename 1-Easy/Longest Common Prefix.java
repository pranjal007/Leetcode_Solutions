
// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        char[] prefix = strs[0].toCharArray();
        for(int i=1;i<strs.length;i++){
            char[] check = strs[i].toCharArray();
            int len = check.length>=prefix.length?prefix.length:check.length;
            int j=0;
            while( j<len && check[j]==prefix[j]){
                j++;
            }
            prefix = Arrays.copyOfRange(prefix, 0, j);
        }
        return new String(prefix);
    }
}