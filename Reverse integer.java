
// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        
        boolean negsign = false;
        if(x<0){
            negsign=true;
            x=Math.abs(x);
            if(x<=Integer.MIN_VALUE){
                return 0;
            }
        }
        long check = 0L;
        
        check = (negsign==true?-(Long.valueOf(new StringBuilder().append(x).reverse().toString())):
        (Long.valueOf(new StringBuilder().append(x).reverse().toString())));
        if(check<0){
            System.out.println(check);
            return Integer.MIN_VALUE <=check?(int)check:0;
        }else{
            return Integer.MAX_VALUE>=check?(int)check:0;
        }
    }
}