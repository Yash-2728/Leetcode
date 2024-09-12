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
        if(head == null){
            return null;
        }

        Node newHead = null;
        Node prev = null;
        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();

        // 1st part sabse pehle val and next pointer ko manage karo 


        while(curr!= null){
            Node temp = new Node(curr.val);
            map.put(curr, temp);

            if(newHead==null){
                newHead = temp;
                prev = newHead;
            }
            else{
                prev.next = temp;
                prev = temp;
            }

            curr = curr.next;
        }


        // 2nd part handling the random pointer
        curr = head;
        Node newCurr = newHead;

        while(curr!=null){
            if(curr.random== null){
                newCurr.random = null;
            }
            else{
                Node k = map.get(curr.random);
                newCurr.random = k;
            }

            curr = curr.next;
            newCurr = newCurr.next;
        }


        return newHead;
    }
}