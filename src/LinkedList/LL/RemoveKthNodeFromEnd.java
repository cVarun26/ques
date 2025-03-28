package LinkedList.LL;

public class RemoveKthNodeFromEnd {

    public static void main(String[] args) {

    }

    public static Node removeKthNode(Node head, int k){
        Node dummyNode = head;

        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }

        int desired = count - k;

        return dummyNode;
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
}
