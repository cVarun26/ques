package LinkedList.LL;

public class MiddleOfLL {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        Node head=convertArrToLL(arr);
        Node middle=middleOfLL(head);
        print(head);

    }

    private static Node convertArrToLL(int[]arr){
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node mover=head;

        for (int i = 1; i <arr.length ; i++) {
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }

    private static Node middleOfLL(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
}
