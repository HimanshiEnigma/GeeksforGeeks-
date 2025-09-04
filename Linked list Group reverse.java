

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if(head==null || k==1){
            return head;
        }
        Stack<Node> st= new Stack<>();
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            int count=0;
        
        while(curr!=null && count<k){
            st.push(curr);
            curr=curr.next;
            count++;
        }
        while(!st.isEmpty()){
            if(prev==null){
                prev=st.pop();
                head=prev;
            } else{
                prev.next=st.pop();
                prev=prev.next;
            }
        }
             prev.next=null;
        }
         
           return head;
    }
  
   
}
