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
    int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newN=new ListNode();
        newN.val=head.val;
        ListNode res=newN;
        ListNode temp=head;
        while(temp.next!=null){
            int gcdVal=gcd(temp.val, temp.next.val);
            ListNode ans=new ListNode(gcdVal);
            res.next=ans;
            res=ans;
            ans.next=new ListNode(temp.next.val);
            res=ans.next;
            temp=temp.next;

        }
        
        return newN;
    }
}