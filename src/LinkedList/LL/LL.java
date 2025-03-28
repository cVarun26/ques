package LinkedList.LL;
class Node {
    public int data;
    public Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LL {

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node convertArrToLL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node removesHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        Node head = convertArrToLL(arr);
        head = removesHead(head);
        print(head);
    }
}