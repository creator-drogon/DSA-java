package arrayProb;

import java.util.ArrayList;
import java.util.List;

public class BurgerCount {

    public static void main(String[] args) {
        int tomato =20;
        int cheese = 18;
       //  = findCount(tomato,cheese);
      //  System.out.println(ans.toString());
        List<Integer> ans  = numOfBurgers(tomato,cheese);
        System.out.println(ans.toString());
    }

    static List<Integer> findCount(int tomato, int cheese) {
        List<Integer> ans = new ArrayList<>();
        int king = 0;
        int small = cheese;
        int left;
        if (tomato == 0 && cheese == 0) {
            ans.add(0);
            ans.add(0);
            return ans;
        }
        if (small < 0 || cheese>=tomato || tomato%2==1 ) return ans;

        left = tomato - 2 * cheese;
        while (left > 0) {
            left = left - 2;
            king++;
            small--;


        }
            if (small >= 0) {

                ans.add(small);
                ans.add(king);

            }

            return ans;


    }


static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> res = new ArrayList();
        if(tomatoSlices == 0 && cheeseSlices == 0){
            res.add(0);
            res.add(0);
             return res;
        }

        int half = cheeseSlices / 2;
        for(int i = 0; i <= half; i++){
            int t1 =  i;
            int t2 = cheeseSlices - i;
            if(t1 * 4 + t2 * 2 == tomatoSlices){
                res.add(t1);
                res.add(t2);
            }
            else if(t1 * 2 + t2 * 4 == tomatoSlices){
                res.add(t2);
                res.add(t1);
            }
        }

        return res;
    }}
