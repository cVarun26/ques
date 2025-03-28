package StacksQueues;

public class StackLLImpl {
    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(2);
        s.push(3);
        s.push(5);
        System.out.println(s.top());
        System.out.println(s.size);
        System.out.println(s.pop());
    }
}
class Node{
   public int data;
    public Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class StackLL{
    Node top;
    int size=0;

    void push(int x){
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size++;
    }

    Node pop(){
        Node temp=top;
        top=top.next;
        size--;
        return top;

    }

    int top(){
        return top.data;
    }

    int size(){
        return size;
    }
}
