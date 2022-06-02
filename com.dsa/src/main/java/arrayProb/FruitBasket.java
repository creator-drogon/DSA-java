package arrayProb;

import java.util.Collections;
import java.util.HashMap;

public class FruitBasket {

    public int totalFruit(int[] fruits) {

        int max =0;
        int lastFruit;
        int secondLastFruit = -1 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< fruits.length;i++){
            map.put(fruits[i],i);

            while (map.size()>2){
                int minIndex = Collections.min(map.values());
                map.remove(fruits[minIndex]);
                secondLastFruit = minIndex+1;

            }
            lastFruit = i;

            max = Math.max(lastFruit-secondLastFruit +1,max);

        }


        return max;
    }
}
