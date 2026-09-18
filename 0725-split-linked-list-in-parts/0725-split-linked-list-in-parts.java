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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        ListNode[] arr = new ListNode[k];
        int a=c%k;
        int b=c/k;
        int x=b+a;
        for(int i=0;i<k;i++)
        {
            arr[i]=temp;
            int y=0;
            if(a>0)
            y=b+1;
            else
            y=b+0;
            a--;
            for(int j=1;j<y;j++)
            {
                if(temp!=null)
                {
                    temp=temp.next;
                }
            }
            if(temp!=null)
            {
                ListNode t1=temp.next;
                temp.next=null;
                temp=t1;
            }
        }
        return arr;
    }
}