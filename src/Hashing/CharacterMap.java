package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CharacterMap {

        public static void main(String[] args) {

           String s="abbsbaa";

            Count(s,s.length());

        }

        public static void Count(String s,int n){

            Map<Character,Integer> map=new HashMap<>();


            for (int i = 0; i < n; i++) {

                char ch=s.charAt(i);

                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else  map.put(ch,1);;

            }

            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }
    }


