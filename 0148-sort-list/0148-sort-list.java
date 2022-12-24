/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
             return head;
        
       // ListNode mid=middleNode(head);
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next != null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;    
            
        }
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        
        return mergeTwoLists(left,right);
    }
    
      
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head=new ListNode();
        ListNode temp=head;
        
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next; 
            }
            }
        
        if(l1 != null){
                temp.next=l1;
                l1=l1.next;
        }
        if(l2 != null){
            temp.next=l2;
            l2=l2.next;
        }
    return head.next;
    }
}
