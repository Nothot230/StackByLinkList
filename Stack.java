public class Stack {
    Node head;
    Stack(){
        this.head = null;
    }
    boolean isEmpty(){
        return head == null;
    }

    void push(int newItem){
        Node n1 = new Node(newItem);
        n1.next = head;
        head = n1;
    }

    void pop(){
        Node temp = head;
        head = head.next;
        temp = null;
    }
    int peek(){
        return head.item;
    }
}
