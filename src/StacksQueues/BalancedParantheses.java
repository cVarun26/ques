package StacksQueues;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {

        String s="()[{}()]";
        if(check(s))
            System.out.println("True");
        else
            System.out.println("False");

    }

    public static boolean check(String s){

        java.util.Stack<Character> stack=new Stack<>();

        for(char it:s.toCharArray()){
            if(it=='('||it=='{'||it=='['){
                stack.push(it);
            }
            else {
                if(stack.isEmpty())return false;
                char ch=stack.pop();
                if((it==')'&&ch=='(') || (it=='}'&&ch=='{') || (it==']'&&ch=='[')) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
