package GreedyAlgo;

import java.util.Vector;

public class MinCoins {
    public static void main(String[] args) {
        System.out.println(minCoins(50));
    }

    public static int minCoins(int V){

        int coins[]={1,2,5,10,20,50,100,500,1000};

        int count=0;
        for (int i = coins.length-1; i>=0 ; i--) {
            while(V>=coins[i]){
                V=V-coins[i];
                count++;
            }
        }
        return count;
    }
}
