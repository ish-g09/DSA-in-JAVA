/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            Node curr=new Node(temp.val);
            curr.next =temp.next;
            temp.next =curr;

            temp =curr.next;
        }
        temp=head;
        
        while(temp!=null){
            if(temp.random!=null) temp.next.random=temp.random.next;
            temp=temp.next.next;
            
        }
        temp=head;
        Node res=temp.next;
        Node copy=res;
        while(temp!=null){
            temp.next=temp.next.next;
            temp=temp.next;
            if(temp!=null)
                {res.next=temp.next;
            res=res.next;
                }
            
        }
        return copy;
        
        
    }
}