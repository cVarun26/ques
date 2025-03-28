package LinkedList.LL;

public class LoopsInLL {

    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2= new Node(2);
        node1.next=node2;
        Node node3=new Node(3);
        node2.next=node3;
        Node node4=new Node(4);
        node3.next=node4;
        node4.next=node2;


        System.out.println(loopDetected(node1));
        Node startingPoint=startingPoint(node1);
        System.out.println(startingPoint.data);
    }
    private static boolean loopDetected(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) return true;
        }
        return false;
    }

    private static Node startingPoint(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
}
