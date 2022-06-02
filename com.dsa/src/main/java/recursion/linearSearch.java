package recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int[] arr = {1,2,3,4,4,5,6};
        find(arr,4,0,list);
        System.out.println(list);
    }


// same object of list is called in every recursion call but the reference variable to reference list object in memory is different
    static ArrayList<Integer> find(int[]arr, int target,int startIndex, ArrayList<Integer> list){

        if(arr[startIndex] == arr.length-1){

            return list;
        }
        if(arr[startIndex] == target) list.add(startIndex);

        return find(arr,target,startIndex+1,list);

    }
}
