package StacksQueues;

public class StackArrayImpl {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(5);
        System.out.println(s.top());
        System.out.println(s.size);
        System.out.println(s.pop());


    }
}

    class Stack{
      int size=10;
      int st[]=new int[size];
      int top=-1;

      void push(int x){
          top++;
          st[top]=x;
      }
      int pop(){
          int x=st[top];
          top--;
          return x;
      }
      int top(){
          return st[top];
      }
      int size(){
          return top+1;
      }
    }




