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
        ListNode a=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode b=temp.next;
            temp.next=a;
            a=temp;
            temp=b;
        }
        return a;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode h=rev(head);
        ListNode temp=h;
        int max=temp.val;
        ListNode x=temp;
        int k=0;
        while(temp!=null)
        {
            if(temp.val<max)
            {

            }
            else
            {
                if(k==0)
                {
                    
                    k=1;
                }
                else
                {
                    max=temp.val;
                    x.next=temp;
                    x=temp;
                }
            }
            temp=temp.next;
        }
        x.next=null;
        return rev(h);
    }
}