package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountMap {
    public static void main(String[] args) {

        int[]arr={1,2,4,55,2,1,1};

        Count(arr, arr.length);

    }

    public static void Count(int arr[],int n){

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < n; i++) {

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else  map.put(arr[i],1);;

        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
