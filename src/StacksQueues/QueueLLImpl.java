package StacksQueues;

public class QueueLLImpl {
    public static void main(String[] args) {

    QueueLL q = new QueueLL();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());  // Should print 1
        System.out.println(q.pop());    // Should print 1
        System.out.println(q.top());  // Should print 2
          System.out.println(q.size());
}
}
class QueueLL{
     Node start,end;
     int size=0;

     void push(int x){
         Node temp=new Node(x);
         if(start==null){
             start=end=temp;
         }
         else {
             end.next=temp;
         }
         size++;
     }

     Node pop(){
        Node temp=start;
        start=start.next;
        size--;
        return start;
     }

     int top(){
         return start.data;
     }
     int size(){
         return size;
     }
}