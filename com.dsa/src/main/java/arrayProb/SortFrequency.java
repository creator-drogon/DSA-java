package arrayProb;

import java.util.*;
import java.util.stream.Collectors;

public class SortFrequency {

    public static void main(String[] args) {

        System.out.println(sort(new int[] {2,3,4,2,2,7,7,8,9}).toString());

    }

    static ArrayList<Integer> sort(int[] arr){
        LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();




        for(int i =0; i< arr.length;i++){

            if(lh.containsKey(arr[i])){

                lh.put(arr[i],lh.get(arr[i])+1);
            }
            else lh.put(arr[i],1);
        }

        ArrayList<Integer> al = new ArrayList<>();

        List<Map.Entry<Integer, Integer>> collect = lh.entrySet().stream().sorted(Comparator.comparing((e) -> e.getValue() < e.getValue())).collect(Collectors.toList());

        collect.forEach((e)->{
            while(e.getValue()>=1){

                al.add(e.getKey());
            }
        });
        return al;
    }
}
