
// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        if(s.length()%2!=0) return false;
        
        char[] a = new char[s.length()];
        int peek=0;
        int j=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                j++;
                a[j]=s.charAt(i);
                peek=j;
            }
            else{
                if((s.charAt(i)==')' && a[peek]=='(') || (s.charAt(i)=='}' && a[peek]=='{') || (s.charAt(i)==']' && a[peek]=='[')){
                    a[peek]=Character.MIN_VALUE;
                    peek--;
                    j--;
                }
                else {return false;}

            }
        }
        if(a[0]==Character.MIN_VALUE) {return true;}
        else{return false;}
    }
}