package LinkedList.LL;

public class ReverseLL {

        public static void main(String[] args) {
            int[]arr={1,2,3,4,5,6};
            Node head=convertArrToLL(arr);
            head=  reverseLLRecursive(head);
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

        private static Node reverseLLIterative(Node head){
            Node temp=head;
            Node prev=null;
            while (temp!=null){
                Node front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
            }
            return prev;
        }

        private static Node reverseLLRecursive(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newHead=reverseLLRecursive(head.next);
            Node front=head.next;
            front.next=head;
            head.next=null;

            return newHead;
        }
    }

