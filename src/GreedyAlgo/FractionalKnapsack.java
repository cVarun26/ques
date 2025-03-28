package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class ItemComparator implements Comparator<Item>{


    @Override
    public int compare(Item a, Item b)
    {
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if(r1 < r2) return 1;
        else if(r1 > r2) return -1;
        else return 0;
    }
}
public class FractionalKnapsack   {

    public static void main(String[] args) {

        int weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = maxValue(arr, weight);
        System.out.println(ans

        );
    }

    public static double maxValue(Item[]arr,int W){

        Arrays.sort(arr,new ItemComparator());

        double totalValue=0.0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].weight<=W){
                totalValue+=arr[i].value;
                W=W-arr[i].weight;
            }else{
                totalValue+=((double)arr[i].value/(double) arr[i].weight)*(double)W;
                break;
            }
        }
        return totalValue;
    }
}
