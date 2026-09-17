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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        
        int c=0,aa=0,bb=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<c;i++)
        {
            if(i==k-1){
                aa=temp.val;
            }
            
            if(i==(c-k))
            {
                bb=temp.val;
            }
            
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<c;i++)
        {
            if(i==k-1){
                
                temp.val=bb;
            }
            
            if(i==(c-k))
            {
                temp.val=aa;
            }
            
            temp=temp.next;
        }
        
        return head;
    }
}