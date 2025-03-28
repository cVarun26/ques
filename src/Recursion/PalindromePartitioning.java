package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        String s="aabb";
        System.out.println(partition(s));
    }
    public static List<List<String >> partition(String s){
        List<List<String>> result=new ArrayList<>();
        List<String>path=new ArrayList<>();
        func(0,s,path,result);
        return result;
    }

   public static void func(int index, String s, List<String>path, List<List<String>> result){
        if(index==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
       for (int i = index; i <s.length() ; i++) {
           if(isPalindrome(s,index,i)){
               path.add(s.substring(index,i+1));
               func(i+1,s,path,result);
               path.remove(path.size()-1);
           }
       }
   }

   public static boolean isPalindrome(String s, int start, int end){
        while (start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }

        }
        return true;
   }
}
