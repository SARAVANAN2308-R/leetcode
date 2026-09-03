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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2= new ArrayList<>();
        while(l1!=null){
            a1.add(l1.val);
            l1=l1.next;
        }
         while(l2!=null){
            a2.add(l2.val);
            l2=l2.next;
        }
        ArrayList<Integer> res= new ArrayList<>();
        int i=0;
        int carry=0;
        while(i<a1.size() || i<a2.size()){
            int num1=0;
            int num2=0;
            if(i<a1.size()){
                num1=a1.get(i);
            }
            if(i<a2.size()){
                num2=a2.get(i);
            }
            int sum=num1+num2+carry;
            res.add(sum%10);
            carry=sum/10;
            i++;
        }
        if(carry>0){
            res.add(carry);
        }
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        for(int hi:res){
            curr.next= new ListNode(hi);
            curr=curr.next;
        }
        return dummy.next;
    }
}