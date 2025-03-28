package LinkedList.LL.Insertion;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class InsertTail {


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
                System.out.println(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }

        private static Node insertTail(Node head, int val){
            if(head==null){
                return new Node(val);
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode= new Node(val);
            temp.next=newNode;
            return head;
        }

    public static void main(String[] args) {
        int[]arr={2,4,5,6};
        Node head=convertArrToLL(arr);
        head=insertTail(head,2);
        print(head);
    }
}
