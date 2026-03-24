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
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode curr1= head,curr2=head.next,even =head.next;
        while(curr1.next!=null && curr1.next.next!=null){
            curr1.next=curr1.next.next;
            curr2.next=curr2.next.next;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        curr1.next=even;
        return head;
    }
}