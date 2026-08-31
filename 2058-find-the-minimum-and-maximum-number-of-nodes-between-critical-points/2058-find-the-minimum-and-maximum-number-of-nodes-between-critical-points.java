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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null) return new int[]{-1,-1};
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode back=head;
        ListNode curr=head.next;
        int i=1;
        while(curr.next!=null){
            if(curr.val>back.val && curr.val>curr.next.val){
                arr.add(i);
            }
            else if(curr.val<back.val && curr.val<curr.next.val){
                arr.add(i);
            }
            curr=curr.next;
            back=back.next;
            i++;
        }
        if(arr.size()<2) return new int[]{-1,-1};

        int arr1[]=new int[2];
        arr1[0]=Integer.MAX_VALUE;
        arr1[1]=Integer.MIN_VALUE;
        for(i=1; i<arr.size(); i++){
            arr1[0] = Math.min(arr1[0], arr.get(i) - arr.get(i - 1));
        }
        arr1[1]=arr.get(arr.size()-1)-arr.get(0);
        return arr1;
        
    }
}