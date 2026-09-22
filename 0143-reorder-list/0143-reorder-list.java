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
    public ListNode rev(ListNode head)
    {
        ListNode c=null;
        ListNode b=head;
        while(b!=null)
        {
            ListNode a=b.next;
            b.next=c;
            c=b;
            b=a;
        }
        return c;
    }
    public void reorderList(ListNode head) {
        
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode r=rev(slow);
        slow.next=null;
        while(temp!=r&&temp!=null&&r!=null)
        {
            ListNode x=temp.next;
            ListNode y=r.next;
            temp.next=r;
            temp=temp.next;
            if(temp==x)
            break;
            temp.next=x;
            r=y;
            temp=temp.next;

        }
        
        

    }
}