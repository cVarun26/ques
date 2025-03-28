package LinkedList.LL;

import java.util.Stack;

public class Palindrome  {
    public static void main(String[] args) {

        int[]arr={1,2,3,2,1};
        Node head=convertArrToLL(arr);
        System.out.println(isPalindromeOptimal(head));
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
    private static boolean isPalindromeNaive(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp=head;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=stack.pop())return false;
            temp=temp.next;

        }
        return true;
    }

    private static boolean isPalindromeOptimal(Node head){

        if(head==null||head.next==null)return true;

        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node newHead=reverseLLRecursive(slow.next);

        Node first=head;
        Node second=newHead;
        while(second!=null){
            if(first.data!=second.data){
                reverseLLRecursive(newHead);
                return false;
            }

            first=first.next;
            second=second.next;
        }
        reverseLLRecursive(newHead);
        return true;

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
