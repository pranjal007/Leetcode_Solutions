
// https://leetcode.com/problems/reverse-integer/

import java.math.BigInteger; 
import java.math.*;
class Solution {
    public int reverse(int x) {
        
        int temp=x;
        int newnum=0;
        while(temp!=0){
            try{
                newnum = Math.addExact(Math.multiplyExact(newnum,10), Math.abs(temp)%10);
            }catch(ArithmeticException  e){
                return 0;
            }
            temp=temp/10;
        }
        if(x<0) return newnum*-1;
        else    return newnum;
           
    }
}