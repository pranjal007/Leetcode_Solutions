
// https://leetcode.com/problems/longest-palindromic-subsequence/

class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] str = s.toCharArray();
        int len = str.length;
        
        if(len==0) return 0;
        if(len ==1) return 1;
        
        int[][] arr = new int[len][len];
        int k=0;
        for(int i=0;i<len;i++){
            k=i;
            for(int j=0;j<len && k<len;j++){
                if(k==j){
                    arr[k][j]=1;
                }
                else if(str[k]==str[j]){
                    arr[j][k]=arr[j+1][k-1]+2;
                }
                else{
                    arr[j][k]=Math.max(arr[j+1][k],arr[j][k-1]);
                }
                k++;
            }
        }/*
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(arr[i][j]+" ,");
            }
            System.out.println();
        }*/
        
        return arr[0][len-1];
    }
}