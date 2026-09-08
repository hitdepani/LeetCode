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
    public ListNode partition(ListNode head, int x) {
        ListNode y=new ListNode(0);
        ListNode z=new ListNode(0);
        ListNode les=y,gre=z;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                les.next=temp;
                les=les.next;
            }
            else
            {
                gre.next=temp;
                gre=gre.next;
            }
            temp=temp.next;
        }
        gre.next=null;
        les.next=z.next;
        return y.next;
        
    }
}