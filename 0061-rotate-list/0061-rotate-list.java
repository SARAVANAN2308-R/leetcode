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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }
        curr.next = head;
        k = k % len;
        if(k == 0) return head;
        int key = len - k;
        ListNode hi = head;
        for(int i = 1; i < key; i++){
            hi = hi.next;
        }
        ListNode rem = hi.next; 
        hi.next = null;         

        return rem;
    }
}