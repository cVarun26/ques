package StacksQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[]arr={4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(Arrays.toString(findNGE(arr)));



    }

    public static int[] findNGE(int[]arr){
        int length=arr.length;
        int[] nge=new int[length];

        Stack<Integer>st=new Stack<>();

        for (int i = length-1; i >=0 ; i--) {
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else nge[i]=st.peek();

            st.push(arr[i]);
        }
        return nge;
    }
}
