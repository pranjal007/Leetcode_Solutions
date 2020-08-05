
// https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int[] count = new int[26];
        
        for(char c : text.toCharArray()){
            count[c- 'a']++;
        }
        
        int minSingle = count[0];
        int minDouble = count[11];
        
        
        int i=1;

            
        minSingle = count[1]<=minSingle?count[1]:minSingle;
        minSingle = count[13]<=minSingle?count[13]:minSingle;
        
        minDouble = count[14]<=minDouble?count[14]:minDouble;
            
        while(i<=minSingle){
                if(i*2<=minDouble) i++;
                else break;
            }

        
        return i-1;
    }
}