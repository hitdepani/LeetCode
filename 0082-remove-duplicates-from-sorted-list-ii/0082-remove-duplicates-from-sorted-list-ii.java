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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=new ListNode(0);
        a.next=head;
        ListNode b=a;
        while(head!=null)
        {
            if(head.next!=null&&head.val==head.next.val)
            {
                while(head.next!=null&&head.val==head.next.val)
                {
                    head=head.next;
                }
                b.next=head.next;
            }
            else
            {
                b=b.next;
            }
            head=head.next;
        }
        return a.next;
    }
}