package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSums{
    public static void main(String[] args) {


        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        System.out.println(subsetSums(arr,arr.size()));
    }

    static void func(int ind, int sum, ArrayList<Integer> arr, int N,ArrayList<Integer> sumSubset){
        if(ind==N){
            sumSubset.add(sum);
            return;
        }

        func(ind+1,sum+arr.get(ind),arr,N,sumSubset);

        func(ind+1,sum,arr,N,sumSubset);
    }

   static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset=new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
}
