
//	https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int[] stack = new int[T.length];
        int curr = 0;
        int[] output = new int[T.length];
        
        for(int i=1;i<T.length;++i){
        
            while(curr>=0 && T[stack[curr]]<T[i]){
            
                output[stack[curr]] = i-stack[curr];
                curr--;
            } 
            curr++;
            stack[curr]=i;
        }
        
        while(curr>=0){
            output[stack[curr]] = 0;
            curr--;
        }
        
        return output; 
    }
}