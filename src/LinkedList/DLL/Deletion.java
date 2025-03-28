package LinkedList.DLL;

public class Deletion {
    public static void main(String[] args) {
     int[]arr={1,2,3,5,5};
     Node head= convertToDLL(arr);
     head=deleteKthNode(head,4);
     print(head);
    }

    private static Node convertToDLL(int[]arr){
        Node head= new Node(arr[0]);
        Node prev=head;
        for (int i = 1; i <arr.length ; i++) {
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp ;
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

    private static Node deleteHead(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }

    private static Node deleteTail(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node tail= head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node newTail= tail.back;
        newTail.next=null;
        tail.back=null;

        return head;
    }

    private static Node deleteKthNode(Node head,int k){
        Node knode = head;
        int count=0;
        while (knode!=null){
            count++;
            if (count==k) break;
            knode=knode.next;
        }
        Node prev=knode.back;
        Node front=knode.next;

        if(prev==null&&front==null){
            return null;
        }
        else if (prev==null){
            return deleteHead(head);
        }
        else if(front==null){
            return deleteTail(head);
        }
        prev.next=front;
        front.back=prev;
        knode.next=null;
        knode.back=null;

        return head;

    }
}
