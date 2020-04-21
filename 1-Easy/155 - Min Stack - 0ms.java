
// https://leetcode.com/problems/min-stack/

class MinStack {

    int top;
    ArrayList<Integer> list;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        top = -1;
        list = new ArrayList<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        list.add(x);
        if(x<min) min=x;
        top++;
    }
    
    public void pop() {
        int y = list.get(top);
        list.remove(top);
        top = top-1;
        if(y==min){
            min = Integer.MAX_VALUE;
            for (Integer num : list) { 		      
                if(num<min) min = num;	
            }
        }
    }
    
    public int top() {
        return list.get(top);
    }
    
    public int getMin() {
        return min;
    }
}