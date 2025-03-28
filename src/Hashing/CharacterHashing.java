package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String s=in.nextLine();

        int[] hash=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                hash[ch-'a']++;
            }
            
        }

        for (int i = 0; i < hash.length ; i++) {

            if(hash[i]>0){
                System.out.println(hash[i]);
            }

        }
    }
}
