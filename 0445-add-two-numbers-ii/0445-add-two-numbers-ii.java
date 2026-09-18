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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> a= new Stack<>();
        Stack<Integer> b= new Stack<>();
        while(l1!=null)
        {
            a.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            b.push(l2.val);
            l2=l2.next;
        }
        ListNode ans=null;
        int carry=0;
        while(!a.isEmpty()||!b.isEmpty()||carry!=0)
        {
            int x=carry;
            if(!a.isEmpty())
            {
                x+=a.pop();
            }
            if(!b.isEmpty())
            {
                x+=b.pop();
            }
            
            if(x<10)
                {
                    ListNode t=new ListNode(x);
                    t.next=ans;
                    ans=t;
                    carry=0;
                }
            else
                {
                    ListNode t=new ListNode(x%10);
                    t.next=ans;
                    ans=t;
                    carry=x/10;
                }   
                
        }
        return ans;
        
    }
}