package LinkedList.LL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2= new Node(2);
        node1.next=node2;
        Node node3=new Node(5);
        node2.next=node3;
        Node node4=new Node(4);
        node3.next=node4;

        Node head=sortLLOptimal(node1);
        print(head);

    }

    private static Node sortListBrute(Node head){
        List<Integer>arr=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(arr);

        int i=0;
        temp=head;
        while (temp!=null){
          temp.data=arr.get(i);
          i=i+1;
          temp=temp.next;


        }
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }

    private static Node sortLLOptimal(Node head){
        if(head==null||head.next==null) return head;

        Node middle=middleNode(head);
        Node leftHead=head;
        Node rightHead=middle.next;
        middle.next=null;

        leftHead=sortLLOptimal(leftHead);
        rightHead=sortLLOptimal(rightHead);

        return merge(leftHead,rightHead); 
    }

    private static Node merge(Node leftHead, Node rightHead) {
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while (leftHead!=null&&rightHead!=null){
            if (leftHead.data<rightHead.data){
                temp.next=leftHead;
                temp=leftHead;
                leftHead=leftHead.next;
            }else {
                temp.next=rightHead;
                temp=rightHead;
                rightHead=rightHead.next;
            }
            if(leftHead!=null)temp.next=leftHead;
            else temp.next=rightHead;

        }
        return dummyNode.next;
    }

    private static Node middleNode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;


        }
        return slow;
    }

}
