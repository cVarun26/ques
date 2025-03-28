package StacksQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {

        StackQ q = new StackQ();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());  // Should print 1
        System.out.println(q.pop());    // Should print 1
        System.out.println(q.top());  // Should print 2
        System.out.println(q.size());
    }
}
class StackQ{
    Queue<Integer>q=new LinkedList<>();

    void push(int x){
        int s=q.size();
        q.add(x);

        for (int i = 0; i <s ; i++) {
            q.add(q.remove());
        }
    }
    int pop(){
        return q.remove();
    }
    int top(){
        return q.peek();
    }
    int size(){
        return q.size();
    }
}
