package practice;

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}

class NodeOperations{
    Node head;
    
    void addNode(int value){
        if(head==null){
            head = new Node(value);
        }else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(value);
        }
    }

    void displayElements(){
        Node current = head;
        while(current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    void middleNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Value is: "+slow.value);
    }
}
public class MiddleNode {
    public static void main(String[] args) {
        NodeOperations nodeOperations = new NodeOperations();
        // Adding Node
       nodeOperations.addNode(1);
       nodeOperations.addNode(2);
       nodeOperations.addNode(3);
       nodeOperations.addNode(4);
       nodeOperations.addNode(5);
        // Displaying Element(value) inside the node
       nodeOperations.displayElements();
        // TO get the Middle Node.
       nodeOperations.middleNode();
    }
}
