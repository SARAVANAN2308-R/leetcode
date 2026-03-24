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
    private ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;;
        }
        ListNode h2=slow.next;
        slow.next=null;
        h2=reverse(h2);
        ListNode h1=head;
         while(h2 != null){
            ListNode temp1 = h1.next;
            ListNode temp2 = h2.next;

            h1.next = h2;
            h2.next = temp1;

            h1 = temp1;
            h2 = temp2;
        }
    }
}