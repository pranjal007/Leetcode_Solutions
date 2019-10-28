
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        ListNode tail = head;
        int counter =1;
        
        if(curr==null) return null;
        
        while(curr.next!=null){
            curr=curr.next;
            counter++;
            if(counter>n+1){
                tail=tail.next;
            }
        }
        if(n<counter){
            tail.next=tail.next.next;
        }
        else{
            head=tail.next;
        }
        
        return head;
        
        
    }
}