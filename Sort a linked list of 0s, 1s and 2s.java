
/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
   ArrayList<Integer> l=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(l);
        temp=head;
        for(int i:l){
            temp.data=i;
            temp=temp.next;
        }
        return head;
    }
}


