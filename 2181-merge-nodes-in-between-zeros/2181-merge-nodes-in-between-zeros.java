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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode a=new ListNode(0);
        ListNode b=a;
        
        while(temp.next!=null)
        {
            if(temp.val==0)
            {
                temp=temp.next;
                int sum=0;
                while(temp.next!=null&&temp.val!=0)
                {
                    sum+=temp.val;
                    temp=temp.next;
                }
                b.next=new ListNode(sum);
                b=b.next;
            }
        }
        return a.next;
    }
}