
// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] arr = new int[128];
        for(char x: magazine.toCharArray()){
            arr[x]++;
        }
        for(char x: ransomNote.toCharArray()){
            if(--arr[x]<0) return false;
        }
        return true;
    }
}