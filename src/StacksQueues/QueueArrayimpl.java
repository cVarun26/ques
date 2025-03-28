package StacksQueues;

public class QueueArrayimpl {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());  // Should print 1
        System.out.println(q.pop());    // Should print 1
        System.out.println(q.top());  // Should print 2
        System.out.println(q.size());
    }

}

class Queue{
    int size=10;

    int q[]=new int[size];
    int currentSize=0;
    int start,end=-1;

    void push(int x){
        if(currentSize==size){
            System.out.println("xxxx");
        }
        if(currentSize==0){
            start=0;
            end=0;
        }
        else end=(end+1)%size;

        q[end]=x;
        currentSize+=1;
    }

    int pop(){
        if(currentSize==0){
            System.out.println("xxxx");
        }
        else if(currentSize==1){
            start=end=-1;
        }
        else start=(start+1)%size;
        int result=q[start];
        currentSize-=1;
        return result ;
    }

    int top(){
        if(currentSize==0){
            System.out.println("xxxx");
        }
        return q[start];
    }
    int size(){
        return currentSize;
    }
}
