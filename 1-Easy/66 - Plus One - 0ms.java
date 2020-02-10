
// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        
        int remainder=1;
        if(digits[digits.length-1]!=9){
            remainder=0;
            digits[digits.length-1]=digits[digits.length-1]+1;
        }
        else{
            digits[digits.length-1]=0;
            for(int i=digits.length-2;i>=0;i--){
                if(digits[i]!=9){
                    digits[i] = digits[i]+remainder;
                    remainder=0;
                    break;
                }
                digits[i]=0;
            }
        }
        if(remainder!=0){
            int[] newArr = new int[digits.length+1];
            for(int i=0;i<digits.length;i++){
                newArr[i+1]=digits[i];
                newArr[0] = remainder;
                return newArr;
            }
        }
        return digits;
    }
}