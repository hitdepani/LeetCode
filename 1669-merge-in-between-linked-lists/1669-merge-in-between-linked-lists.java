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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode temp1=list1;
        
        int c=0,d=0;
        while(temp.next!=null)
        {
            if(c==a-1)
            {
                
                while(temp1.next!=null)
                {
                    if(d==b)
                    {
                        temp.next=list2;
                        while(list2.next!=null)
                        list2=list2.next;
                        list2.next=temp1.next;
                        break;
                    }
                    d++;
                    temp1=temp1.next;
                }
                break;
            }
            c++;
            d++;
            temp=temp.next;
            temp1=temp1.next;
        }
        return list1;
    }
}