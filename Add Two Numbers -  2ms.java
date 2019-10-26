
// https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = null;
        ListNode temp = new ListNode(0);
        ListNode root = temp;
        int carry = 0;
        while(l1!=null || l2!=null){
            
            if(l1!=null && l2!=null){
                if(l1.val + l2.val +carry >9){
                    temp.next = new ListNode((l1.val + l2.val + carry)%10);
                    carry=1;
                }
                else{
                    temp.next = new ListNode((l1.val + l2.val + carry));
                    carry=0;
                }

                l1=l1.next;
                l2=l2.next;
                temp=temp.next;
            }
        
        else if(l2!=null){
                if(l2.val +carry >9){
                    temp.next = new ListNode((l2.val + carry)%10);
                    carry=1;
                }
                else{
                    temp.next = new ListNode(( l2.val + carry));
                    carry=0;
                }
                l2=l2.next;
                temp=temp.next;
        }
        else if(l1!=null){
                if(l1.val +carry >9){
                    temp.next = new ListNode((l1.val + carry)%10);
                    carry=1;
                }
                else{
                    temp.next = new ListNode(( l1.val + carry));
                    carry=0;
                }
                l1=l1.next;
                temp=temp.next;
        }
    }
        if(carry==1){
            temp.next = new ListNode( carry);
        }
        return root.next;
    }
}