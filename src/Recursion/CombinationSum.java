package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[]arr={2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }

    public static void func(int index, int target, int[]arr, List<List<Integer>> ans, List<Integer> ds){

        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            func(index,target-arr[index],arr,ans,ds);
            ds.remove(ds.size()-1); //To bactrack and remove element so that ds is in same size for next combination.
        }
        func(index+1,target,arr,ans,ds);
    }

    public static List<List<Integer>> combinationSum(int[]candidates, int target){
        List<List<Integer>> ans= new ArrayList<>();
        func(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}
