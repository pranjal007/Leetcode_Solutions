
// https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> list = new LinkedList<String>();
        int i=1;
        while(i<=n){
            if(i%15==0) list.add("FizzBuzz");
            else if(i%5==0) list.add("Buzz");
            else if(i%3==0) list.add("Fizz");
            else list.add(Integer.toString(i));
            i++;
        }
        return list;
    }
}