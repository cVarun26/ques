package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class CombinationSum2  {
     public static void main(String[] args) {
         int[]arr={10,1,2,7,6,1,5};
         System.out.println(combinationSum2(arr,8));

     }

     static void func(int index, int target, int[]arr, List<List<Integer>> ans, List<Integer> ds) {
         if (target == 0) {
             ans.add(new ArrayList<>(ds));
             return;
         }

         for (int i = index; i < arr.length; i++) {

             if (i > index && arr[i] == arr[i - 1]) continue;
             if (arr[i] > target) break;

             ds.add(arr[i]);
             func(i + 1, target - arr[i], arr, ans, ds);
             ds.remove(ds.size() - 1);
         }
     }

     public static List<List<Integer>> combinationSum2(int[]arr, int target){
         List<List<Integer>> ans=new ArrayList<>();
         Arrays.sort(arr);
         func(0,target,arr,ans,new ArrayList<>());
         return ans;
     }
 }
