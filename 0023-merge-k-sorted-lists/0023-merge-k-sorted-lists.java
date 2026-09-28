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
    public ListNode merge(ListNode a,ListNode b)
    {
            ListNode temp= new ListNode(0);
            ListNode t1=temp;
            while(a!=null&&b!=null)
            {
                if(a.val<=b.val)
                {
                    t1.next=a;
                    a=a.next;
                }
                else
                {
                    t1.next=b;
                    b=b.next;
                }
                t1=t1.next;
            }
            if(a!=null)
            {
                t1.next=a;
            }
            if(b!=null)
            {
                t1.next=b;
            }
            return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(lists==null||n==0)
        return null;
        ListNode temp=lists[0];
        
        for(int i=1;i<n;i++)
        {
            temp=merge(temp,lists[i]);
            
        }
        return temp;
        
    }
}