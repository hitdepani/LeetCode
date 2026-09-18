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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        temp=head;
        int arr[]= new int[c];
        for(int i=0;i<c;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        Stack<Integer> st= new Stack<>();
        for(int i=c-1;i>=0;i--)
        {

            int a=arr[i];
            while(!st.isEmpty()&&st.peek()<=a)
            {
                st.pop();
            }
            if(!st.isEmpty())
            arr[i]=st.peek();
            else
            arr[i]=0;
           
            st.push(a);
            
        }
        return arr;
    }
}