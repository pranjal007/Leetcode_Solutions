
// https://leetcode.com/problems/reverse-linked-list-ii/

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(head==null) return null;
        //if(head.next==null) return head;
        //if(m==n) return head;
         ListNode orghead = new ListNode(0);
        orghead.next = head;
        
        ListNode prev=orghead;
        for(int i=0;i<m-1;i++){
            prev = prev.next;
        }
        
        ListNode start = prev.next;
        ListNode after = start.next;
        
        for(int i=0;i<n-m;i++){
            start.next = after.next;
            after.next = prev.next;
            prev.next = after;
            after = start.next;
        }
        
        return orghead.next;
    }
}