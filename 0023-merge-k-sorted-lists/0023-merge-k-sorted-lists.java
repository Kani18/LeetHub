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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0)
            return null;
        ListNode res = lists[0];
        int i = 1;
        while(i < n){
            res = mergeTwoLists(res, lists[i]);
            i++;
        }
        return res;
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

