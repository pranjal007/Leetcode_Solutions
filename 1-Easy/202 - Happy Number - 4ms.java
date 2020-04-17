
// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        
        int x=n;
        int number;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        do{
            number = x;
            x=0;
            while(number>0){
                int temp = number%10;
                x = x + (int)Math.pow(temp,2);
                number = number/10;
            }
            if(map.containsKey(x)==true){
                return false;
            }else{
                map.put(x,1);
            }
            if(x==1){
                return true;
            }
            if(x==0) return false;
        }while(x!=n);
            
        return false;

        
    }
}