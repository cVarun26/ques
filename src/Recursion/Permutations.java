package Recursion;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Permutations  {
    public static void main(String[] args) {

        int[]arr={1, 2, 3};
        System.out.println(Permutation(arr));
    }

    public static void perm(int index, int[]arr, List<List<Integer>>ans){
        if(index==arr.length){
            List<Integer>ds=new ArrayList<>();
            for (int i = 0; i <arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i <arr.length; i++) {
            Swap(i, index,arr);
            perm(index+1,arr,ans);
            Swap(i,index,arr);
        }
    }

    private static void Swap(int i, int index, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }

    public static List<List<Integer>> Permutation(int[]arr){
        List<List<Integer>> ans= new ArrayList<>();
        perm(0,arr,ans);
        return ans;
    }
}
