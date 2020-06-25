
// https://leetcode.com/problems/number-complement/

class Solution {
    public int findComplement(int num) {
        char[] x = Integer.toBinaryString(num).toCharArray();
        for(int i=0;i<x.length;i++){
            if(x[i]=='0') x[i]='1';
            else x[i] = '0';
        }
        return Integer.parseInt(new String(x),2);
    }
}