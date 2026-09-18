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
        ListNode temp=head.next;
        ListNode a=head.next;
        
        
        while(temp!=null)
        {
                int sum=0;
                while(temp.val!=0)
                {
                    sum+=temp.val;
                    temp=temp.next;
                }
                a.val=sum;
                temp=temp.next;
                a.next=temp;
                a=a.next;
            
        }
        return head.next;
    }
}