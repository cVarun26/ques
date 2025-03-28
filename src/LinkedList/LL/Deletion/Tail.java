package LinkedList.LL.Deletion;

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

public class Tail {

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

    private static Node removeTail(Node head){
        if(head==null||head.next==null)return null;

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node removeK(Node head, int k){
        if(head==null)return head;
        if(head.data==k){
            Node temp=head;
            return head;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;

    }


    public static void main(String[] args) {
        int[]arr={2,4,5,6};
        Node head=convertArrToLL(arr);
        head=removeK(head,2);
        print(head);
    }
}