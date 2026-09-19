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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode ans=null;
        int c=0;
        while(!st.isEmpty())
        {
            int sum=st.pop()*2+c;
            c=sum/10;
            ListNode t=new ListNode(sum%10);
            t.next=ans;
            ans=t;
        }
        if(c>0)
        {
            ListNode t=new ListNode(c);
            t.next=ans;
            ans=t;
        }
        return ans;
    }
}