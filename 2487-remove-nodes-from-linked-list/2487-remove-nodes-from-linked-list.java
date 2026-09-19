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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st= new Stack<>();
        while(temp!=null)
        {
            if(st.isEmpty())
            {
                st.push(temp.val);
            }
            else
            {
                if(st.peek()>=temp.val)
                st.push(temp.val);
                else
                {
                    while(!st.isEmpty()&&st.peek()<temp.val)
                    st.pop();
                    st.push(temp.val);
                }
            }
            temp=temp.next;
        }
        ListNode ans=null;
        while(!st.isEmpty())
        {
            ListNode t=new ListNode(st.pop());
            t.next=ans;
            ans=t;
        }
        return ans;
    }
}